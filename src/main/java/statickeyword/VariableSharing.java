package staticKeyword;

import com.example.VariablesDemo.StaticVariableExample;

public class VariableSharing {
    String name;
    int salary;
    static String company="BuSoftTech";
    VariableSharing(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    static void changeValue(){
        company="cts";
    }
    void display()
    {
        System.out.println(name+" "+salary+" "+company);
    }
    public static void main(String[] args) {
        VariableSharing s1=new VariableSharing("Rahim",15000);
        VariableSharing s2=new VariableSharing("Raja",20000);
        s1.display();
        s2.display();
        changeValue();
        //VariableSharing.company="Cts";
        s1.display();
        s2.display();
    }
}
