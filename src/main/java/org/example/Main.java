package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                // Crear el diccionario Español-Inglés
                Map<String, String> dictionary = new HashMap<>();
         dictionary.put("casa", "house");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("libro", "book");
        dictionary.put("jugar", "play");
        dictionary.put("hola", "hello");
        dictionary.put("mesa", "table");
        dictionary.put("amarillo", "yellow");
        dictionary.put("manzana", "apple");
        dictionary.put("agua", "water");
        dictionary.put("carro", "car");
        dictionary.put("familia", "family");
        dictionary.put("escuela", "school");
        dictionary.put("rojo", "red");
        dictionary.put("verde", "green");
        dictionary.put("azul", "blue");
        dictionary.put("naranja", "orange");
        dictionary.put("comer", "eat");
        dictionary.put("bebida", "drink");
        dictionary.put("trabajar", "work");
                // Escoger al azar 5 palabras en español del mini diccionario
                String[] spanishWords = dictionary.keySet().toArray(new String[0]);
                String[] selectedWords = getRandomWords(spanishWords, 5);

                // Pedir al usuario que traduzca cada palabra y verificar si son correctas
                Scanner scanner = new Scanner(System.in);
                int correctAnswers = 0;
                int incorrectAnswers = 0;

                System.out.println("Por favor, traduce las siguientes palabras al inglés:");
                for (String word : selectedWords) {
                    System.out.print(word + ": ");
                    String translation = scanner.nextLine();
                    if (dictionary.get(word).equalsIgnoreCase(translation)) {
                        System.out.println("¡Correcto!");
                        correctAnswers++;
                    } else {
                        System.out.println("Incorrecto. La respuesta correcta es: " + dictionary.get(word));
                        incorrectAnswers++;
                    }
                }

                // Mostrar el número de respuestas correctas e incorrectas
                System.out.println("Respuestas correctas: " + correctAnswers);
                System.out.println("Respuestas incorrectas: " + incorrectAnswers);

                scanner.close();
            }

            // Método para obtener un número aleatorio de palabras del diccionario
            public static String[] getRandomWords(String[] words, int count) {
                Random random = new Random();
                String[] selectedWords = new String[count];
                for (int i = 0; i < count; i++) {
                    selectedWords[i] = words[random.nextInt(words.length)];
                }
                return selectedWords;
            }
        }


