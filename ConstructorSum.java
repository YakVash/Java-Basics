class ConstructorSum {
    
    ConstructorSum() {
        System.out.println("Sum: "+(1+2));
    }
    ConstructorSum(int a, int b) {
        
        System.out.println("Sum: "+(a+b));
    }
    ConstructorSum(float a, float b){
        
        System.out.println("Sum: "+(a+b));
    }

    

    public static void main(String[] args){
        ConstructorSum S = new ConstructorSum();
        ConstructorSum S1 = new ConstructorSum(2,5);
        ConstructorSum S2 = new ConstructorSum(1.3f,5.5f);

        
    }
}