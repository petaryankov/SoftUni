package day12ObjectsAndClassesExercise.P1AdvertisementMessage;

public class AdvertisementMessage {

    //•	Phrases – {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
    //•	Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"}
    //•	Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
    //•	Cities - {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
    private final String[] phrases = {"Excellent product.", "Such a great product."
            , "I always use that product.", "Best product of its category."
            , "Exceptional product.", "I can’t live without this product."};
    private final String[] events = {"Now I feel good.", "I have succeeded with this product."
            , "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome."
            , "Try it yourself, I am very satisfied.", "I feel great!"};
    private final String[] authors = {"Diana", "Petya", "Stella", "Elena"
            , "Katya", "Iva", "Annie", "Eva"};
    private final String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public String[] getPhrases() {
        return phrases;
    }

    public String[] getEvents() {
        return events;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String[] getCities() {
        return cities;
    }
}
