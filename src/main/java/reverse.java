public class reverse {
    public static void main(String args[]){
        System.out.println(reverse("devender"));
      //  System.out.print("devender".substring(1));
}
static String  reverse(String s1){

        System.out.println(s1);
    if(s1.isEmpty() || s1.length()==1)
        return s1;

    return reverse(s1.substring(1)) + s1.charAt(0);

}
}
