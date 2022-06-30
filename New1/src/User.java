/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/20/11:06
 * @Description:
 */

public class User implements Comparable<User> {
    private String name;
    private int age;
    private int height;
    public User(){
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public User(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(User o) {
        return o.getAge() - this.age;
    }
}
