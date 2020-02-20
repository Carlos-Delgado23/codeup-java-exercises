package movies;

public class Movie {
    private String name;
    private String category;

//    @Override
//    public String toString() {
////        return getMovie();
//    }

    public Movie(){}
    public Movie(String movieName, String movieCategory){
        name = movieName;
        category = movieCategory;
    }

    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }


    public void setMovie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }



}
