package com.rashiktimalsina.OOPs.Polymorphism;

 class Movie {
    private String mov_name;

    public Movie(String mov_name) {
        this.mov_name = mov_name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getMov_name() {
        return mov_name;
    }
}

class Avengers extends Movie{

    public Avengers() {
        super("avengers");
    }

    @Override
    public String plot(){
        return "Avengers try to stop Thanos from conquering the world ";
    }
}

class ThreeIdiots extends Movie{

    public ThreeIdiots() {
        super("Three Idiots");
    }

    @Override
    public String plot(){
        return "3 engineering students with different problems ";
    }
}

class PurnaBahadurKoSarangi extends Movie{

    public PurnaBahadurKoSarangi() {
        super("PurnaBahadurKoSarangi");
    }

    @Override
    public String plot(){
        return "PurnaBahadur's struggle as a so-called low caste commmunity people in nepal";
    }

}

class Jaari extends Movie{

    public Jaari() {
        super("Jaari");
    }


    @Override
    public String plot(){
        return "Provision of Marriage system in Limbu Community creates a bias";
    }
}

class NotAMovie extends Movie{
    public NotAMovie() {
        super("NotAMovie");
    }

    //No plot here where the plot method in superclass gets returned with the concept of polymorphism
}



public class MainClass{
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){

            Movie movie= randomMovie();
            System.out.println("Movie #" + i + " :" + movie.getMov_name() + "\n" + "Plot " + movie.plot());

        }
    }

    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random() *5)+1;
        System.out.println("Random number generated was " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Avengers();

            case 2:
                return new ThreeIdiots();

            case 3:
                return new PurnaBahadurKoSarangi();

            case 4:
                return new Jaari();

            case 5:
                return new NotAMovie();


//            default:
//                return null;
        }

        return null;

    }

}
