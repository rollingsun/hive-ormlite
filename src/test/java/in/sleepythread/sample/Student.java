package in.sleepythread.sample;


import in.sleepythread.HiveDbConfig;

@HiveDbConfig(db="test",table ="student")
public class Student {

  private String name;
  private String phoneNo;
  private Integer age;

  public Student(String name, String phoneNo, int age) {
    this.name = name;
    this.phoneNo = phoneNo;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public Integer  getAge() {
    return age;
  }
}

