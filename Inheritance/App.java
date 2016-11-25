public class App
{
    public static void main( String[] args )
    {
        Job j = new Job(5000, 1);
        //System.out.println(j);

        //President p = new President(1, 3, "Canada");
        //System.out.println(p);

        //Teacher t = new Teacher(999999999, 10, "CMIS", "Computer Science");
        //System.out.println(t);

        Job[] js = new Job[12];
        for( int index = 0; index < js.length; index++ )
        {
            int chance = (int)(Math.random() * 3);
            if( chance == 0 )
            {
                js[index] = new President((int)(Math.random() * 40000), (int)(Math.random() * 4 + 1), randomName());
            }//end if
            else if( chance == 1 )
            {
                js[index] = new Teacher( (int)(Math.random() * 999999999), (int)(Math.random() * 25) + 1, randomName(), randomName());
            }//end else if
            else if( chance == 2 )
            {
                js[index] = new HSTeacher( (int)(Math.random() * 999999999), (int)(Math.random() * 25) + 1, randomName(), randomName(), (int)(Math.random() * 6 + 7));
            }//end else if
        }//end for
        for( int index = 0; index < js.length; index++ )
        {
            if( js[index] instanceof President )
            {
                President p = (President)(js[index]);
                p.setCountry("Thailand");
                System.out.println(p);
            }//end if
            else if( js[index] instanceof HSTeacher )
            {
                HSTeacher h = (HSTeacher)(js[index]);
                h.setSchool("CMIS");
                h.setSubject("Computer Science");
                h.setGradeLevel(12);
                System.out.println(h);
            }//end else if
            else if( js[index] instanceof Teacher )
            {
                Teacher t = (Teacher)(js[index]);
                t.setSchool("NIS");
                t.setSubject("Engrish");
                System.out.println(t);
            }//end else if
        }//end for
    }//end method main
    public static String randomName()
    {
        int length = (int)(Math.random() * 13 + 1);
        char[] name = new char[length];
        for( int index = 0; index < name.length; index++ )
        {
            name[index] = (char)(int)(Math.random() * 58 + 65);
        }//end for
        String out = new String(name);
        return out;
    }//end method randomName
}//end class App