/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/15/15:08
 * @Description:
 */
public class SnowFlake {
    private static final long twepoch = 1288834974657L;
    private static final long workerIdBit = 5L;
    private static final long datacenterIdBit = 5L;
    private static final long maxWorkerId = -1L ^ (-1L << workerIdBit);
    private static final long maxDatacenterId = -1L ^ (-1L << datacenterIdBit);
    private static final long sequenceBit = 12L;
    private static final long workerIdShift = sequenceBit;
    private static final long datacenterIdShift = sequenceBit + workerIdBit;
    private static final long timestampLeftShift = sequenceBit + workerIdBit + datacenterIdBit;
    private static final long sequenceMask = -1L ^ (-1L << sequenceBit);
    private long workerId;
    private long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;
    public SnowFlake(long workerId, long datacenterId) {
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }
    public synchronized long nextId() {
        long timestamp = timeGen();
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                timestamp = tileGen();
            }
        } else {
            sequence = 0;
        }
        lastTimestamp = timestamp;
        long id = ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift) | (workerId << workerIdShift) | sequence;
        return id;
    }
    private long tileGen() {
        long tile = System.currentTimeMillis();
        return tile;
    }
    private long timeGen() {
        return System.currentTimeMillis();
    }
}

