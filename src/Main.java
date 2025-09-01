import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide", "Basic Java"));
        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Advanced Java Tutorial", 1200);
        engagements.put("Spring Boot Guide", 800);
        engagements.put("Basic Java", 90);

        LinkedList<String> trending = manager.findTrendingPosts(posts, engagements);
        HashSet<String> authors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");


        System.out.println("≡≡≡ Social Media Post Manager ≡≡≡");
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagement);
        System.out.println("Category: " + category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}
