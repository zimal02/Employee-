                        //Nested Class(Match the filename class->public other class will be default
                        //Static Nested class
/*public class Library {
            //Default class
    static class Books {
        //Var declare
        String author;
        String title;
                //Constructor
        Books(String author, String title) {
            this.author = author;
            this.title = title;
        }
                //output display
        public void display() {
            System.out.println(author + "by" + title);
        }

    }
            //Creating collection store Books
    ArrayList<Books> book=new ArrayList<>() ;
            //method adding new
    void addBook(String a , String b){
        book.add(new Books(a, b));
    }
            //using enhance for loop) for display book
    void showBook(){
        for (Books bok : book) bok.display();
    }
            //Main method
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("java Developer","Ali");
        lib.addBook("Software development","Ahmed");
        lib.showBook();

    }
}*/

                //Non Static class

/*public class Library{
                //outer private var
    private String libName="SOSCO";
     class Books{
        String Author;
        String Title;
                //constructor
        Books(String Author,String Title){
            this.Author=Author;
            this.Title=Title;
        }
            //output display
        void display(){
            System.out.println(Author + "write book by\n" + Title +" \nLibrary name is\n" +libName);
        }
    }
            //Books store in collection
    ArrayList<Books> book=new ArrayList<>();
            //Add new books
    void addBook(String T,String a){
        book.add( new Books(T,a));
    }
            //display book
    void showBook(){
        for(Books bok :book)bok.display();
    }
            //Main
    public static void main(String[] args){

        Library lib=new Library();
        lib.addBook("SQL","Wasim");
        lib.addBook("java","Ali");
        lib.showBook();
            //create inner class obj
        Library.Books lb=lib.new Books("Asim","Mariadb");
    }
                }*/
                        //Local inner class

/*public class Library{

    void showDetail(){
                        //define class inside the method, also create object inside method
        class chair{
             String Color;
             int num_of_chairs;
            chair(String Color,int num){
                this.Color=Color;
                this.num_of_chairs=num;
            }

            void display(){
                System.out.println("Number of chair in Library:"+ num_of_chairs + "color of chairs:" + Color);
            }
        }
                    //create obj
        chair chr=new chair("Brown",3487);
       chr.display();
    }
                    //define object
    public static void main(String[] args){
        Library lib=new Library();


        lib.showDetail();


    }

}*/
                        //Anonymous Class
interface Library {
    void display();

    public static void main(String[] args) {
        String ChairColor = "brown";
        int num_of_chairs = 34;
        Library lib = new Library()   //Creat temporary obj for Implementation
        {
            @Override
            public void display() {//

                System.out.println("Number of chair in Library:" + num_of_chairs + "color of chairs:" + 34);
            }
        };
        lib.display();


    }
}
