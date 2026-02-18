//Basics of constructor
class Result {
    String Regno;
    String name;
    Result() {
        Regno = "MCA1";
        name = "John";
        System.out.println("Regno: "+ Regno+"  Name: "+name);
    }
    Result(String S, String S1) {
        this.Regno = S;
        this.name = S1;
        System.out.println("Regno: "+ Regno+"  Name: "+name);
    

    

public static void main(String[] args)
{
Result St = new Result();
Result St1 = new Result("MCA3", "Johnna");
Result St2 = new Result("MCA2", "Percy");
Result St3 = new Result(); 



}
}