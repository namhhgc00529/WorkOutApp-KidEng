package util;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by arock on 8/13/2015.
 */
@DatabaseTable(tableName = "util.User")
public class User implements Serializable {
    @DatabaseField(generatedId = true)
    private int userID;
    @DatabaseField(index = true)
    double weight;
    @DatabaseField
    double height;
    @DatabaseField
    int age;
    @DatabaseField
    String sex;
    @DatabaseField
    double bmi;
    @DatabaseField
    int status;
    @DatabaseField
    double bmr;
    @DatabaseField
    double intensiveact;
    @DatabaseField
    double caloriesmaintain;
    @DatabaseField
    double weightGoal;
    @DatabaseField
    Date dateStart;
    @DatabaseField
    Date dateFinish;

//    @DatabaseField(persisted = )

    public User() {
    }

    public User(int userID, double weight, double height, int age, String sex, double bmi, int status, double bmr, double intensiveact, double caloriesmaintain, double weightGoal, Date dateStart, Date dateFinish) {
        this.userID = userID;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
        this.bmi = bmi;
        this.status = status;
        this.bmr = bmr;
        this.intensiveact = intensiveact;
        this.caloriesmaintain = caloriesmaintain;
        this.weightGoal = weightGoal;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(int bmr) {
        this.bmr = bmr;
    }

    public double getIntensiveact() {
        return intensiveact;
    }

    public void setIntensiveact(double intensiveact) {
        this.intensiveact = intensiveact;
    }

    public double getCaloriesmaintain() {
        return caloriesmaintain;
    }

    public void setCaloriesmaintain(double caloriesmaintain) {
        this.caloriesmaintain = caloriesmaintain;
    }

    public double getWeightGoal() {
        return weightGoal;
    }

    public void setWeightGoal(double weightGoal) {
        this.weightGoal = weightGoal;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
