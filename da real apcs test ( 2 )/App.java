public class App{
    public static void main( String[] args )
    {
        Student mmgtest = new Student("Terra", 9);
        mmgtest.justdoit();
        Grade[] outlet = mmgtest.minMaxGrades();
        System.out.println(outlet[0].getScore() + outlet[1].getScore());
    }//end method main
}//end class