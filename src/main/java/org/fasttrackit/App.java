package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
        cozaLozaWoza.printCozaLozaWoza(35, 200);
        ExercisesLoopFor exercisesLoopFor = new ExercisesLoopFor();
        // exercitiu 1
        exercisesLoopFor.Numbers();
        //exercitiul 2
        exercisesLoopFor.Numbers2();
        //exercitiul 3
        exercisesLoopFor.Numbers3();
        //exercitiul4
        exercisesLoopFor.Numbers4();
        //exercitiul 5
        exercisesLoopFor.EvenNumbers();
        //exercitiul 6
        exercisesLoopFor.OddNumbers();
        //exercitiul 7
        exercisesLoopFor.SumNumbers();
        //exercitiul 8
        exercisesLoopFor.MediaNumbers();
        //exercitiul 9
        exercisesLoopFor.Array(new String[][]{{"*******"}, {"******"}, {"*****"}, {"****"}, {"***"}, {"**"}, {"*"}});


    }

}