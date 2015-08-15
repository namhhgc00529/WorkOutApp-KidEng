import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by arock on 8/13/2015.
 */
@DatabaseTable(tableName = "User")
public class User implements Serializable {
    @DatabaseField(generatedId = true)
    private int userID;
    @DatabaseField(index = true)
    float weight;
    @DatabaseField
    float height;
    @DatabaseField
    int age;
    @DatabaseField
    String sex;
    @DatabaseField
    float bmi;
    @DatabaseField
    int status;
    @DatabaseField
    int bmr;
    @DatabaseField
    float intensiveact;
    @DatabaseField
    float caloriesmaintain;
    @DatabaseField
    float weightGoal;
    @DatabaseField
    String dateStart;
    @DatabaseField
    String dateFinish;

//    @DatabaseField(persisted = )

    public User() {
    }

    public User(int userID, float weight, float height, int age, String sex, float bmi, int status, int bmr, float intensiveact, float caloriesmaintain, float weightGoal, String dateStart, String dateFinish) {
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
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

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBmr() {
        return bmr;
    }

    public void setBmr(int bmr) {
        this.bmr = bmr;
    }

    public float getIntensiveact() {
        return intensiveact;
    }

    public void setIntensiveact(float intensiveact) {
        this.intensiveact = intensiveact;
    }

    public float getCaloriesmaintain() {
        return caloriesmaintain;
    }

    public void setCaloriesmaintain(float caloriesmaintain) {
        this.caloriesmaintain = caloriesmaintain;
    }

    public float getWeightGoal() {
        return weightGoal;
    }

    public void setWeightGoal(float weightGoal) {
        this.weightGoal = weightGoal;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(String dateFinish) {
        this.dateFinish = dateFinish;
    }
}
