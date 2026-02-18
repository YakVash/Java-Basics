//binary number with alternating bits

class binNo_alt_bits {
    public boolean alternating(int n){
        int prev = n & 1;
        n >>= 1;
        while(n > 0) {
            int curr = n & 1;
            if (curr == prev) {
                return false;
            }

            prev = curr;
            n >>= 1;

        }
        return true;
    }

    public static void main(String[] args) {
    System.out.println(new binNo_alt_bits().alternating(5));
}
}