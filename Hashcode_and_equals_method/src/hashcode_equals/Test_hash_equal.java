package hashcode_equals;

public class Test_hash_equal {

    public static void main(String[] args) {

        String a = "sakshi";
        String b = "sakshi";

        if(a.equals(b))
        {
            System.out.println("a & b are equal variables , their hashcodes are : "+ "" +a.hashCode()+ "and " + b.hashCode() );
        }
        else
        {
            System.out.println("a & b are not equal variables , their hashcodes are  : "+ "" +a.hashCode()+ " and " + b.hashCode() );
        }

        String c = "sakshi";
        String d = "kalyani";

        if(c.equals(d))
        {
            System.out.println("c & d are equal variables , their hashcodes are : "+ "" +c.hashCode()+ "  and " + d.hashCode() );
        }
        else
        {
            System.out.println("c & d are not equal variables , their hashcodes are : "+ "" +c.hashCode()+ " and " + d.hashCode() );
        }

    }

}
