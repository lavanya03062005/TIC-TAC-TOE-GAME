package player;

public class Player {
String name;
char symbol;
int age;
String address;
String contactnumber;
String emailid;
public void setplayerdetails(String name,char symbol,int age,String address,String contactno,String emailid){
    this.name=name;
    this.symbol=symbol;
    this.age=age;
    this.address=address;
    this.contactnumber=contactno;
    this.emailid=emailid;
}
public void setplayernameage(String name,int age){
    this.name=name;
    this.age=age;
}
public void setplayername_email_age_symbol(String name,char symbol,int age,String emailid ){
    this.name=name;
    this.symbol=symbol;
    this.age=age;
    this.emailid=emailid;
}
public void setplayernamesymbol(String name,char symbol){
    this.name=name;
    this.symbol=symbol;
}
public String getplayername(){
    return this.name;
}
public char getplayersymbol(){
    return this.symbol;
}
public void changesymbol(char symbol){
    this.symbol=symbol;
}
public void getplayernameage(){
    System.out.println("player name : "+this.name);
    System.out.println("player age : "+this.age);
}
public void getplayernamesymbol(){
    System.out.println("player name : "+this.name);
    System.out.println("player symbol : "+this.symbol);
}
public void getplayerdetails(){
    System.out.println("player name : "+this.name);
    System.out.println("player symbol : "+this.symbol);
    System.out.println("player age : "+this.age);
    System.out.println("player address : "+this.address);
    System.out.println("player contactnumber : "+this.contactnumber);
    System.out.println("player emailid : "+this.emailid);
}
}
