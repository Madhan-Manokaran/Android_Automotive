package data

import android.util.Log
import data.model.Place

/**
 * A list of predefined places representing various hospitals with their details.
 */
val PLACES = listOf(
    Place( 0,
        51.5064,
        -0.0882,
        "The Ivy Tower Bridge",
        "The Ivy Tower Bridge is a sophisticated British restaurant offering a relaxed yet refined dining experience. Located close to the iconic Tower Bridge, it offers stunning views of the bridge and the River Thames. The menu features a wide range of classic British dishes, including steaks, seafood, and seasonal specialties.",
        "Monday-Sunday 8:00 AM - 12:00 AM."),
    Place(1,
        51.5076,
        -0.0876,
        "Aqua Shard",
        "Aqua Shard is a contemporary British restaurant located on the 31st floor of The Shard, offering panoramic views of London. The restaurant serves innovative British cuisine with a focus on locally sourced ingredients. The menu includes dishes such as roast meats, fresh seafood, and vegetarian options, all presented with modern flair.",
        "Monday-Sunday 7:00 AM - 1:00 AM."),
    Place(2,
        51.5049,
        -0.0856,
        "Oblix",
        "Oblix is a high-end restaurant located on the 32nd floor of The Shard, divided into two distinct areas: Oblix East and Oblix West. The restaurant offers a modern dining experience with a menu that features a variety of grilled meats, seafood, and seasonal dishes. The views of the London skyline from Oblix are truly spectacular, making it a popular choice for both locals and tourists.",
        "Monday-Sunday 12:00 PM - 11:00 PM."),
    Place(3,
        51.5073,
        -0.0902,
        "Padella",
        "Padella is a cozy Italian restaurant known for its hand-rolled pasta and simple yet delicious Italian dishes. Located just a short walk from London Bridge, Padella offers a casual dining experience with a focus on fresh, high-quality ingredients. The menu includes a variety of pasta dishes, such as pappardelle with beef shin ragu and tagliarini with lemon and parmesan.",
        "Monday-Saturday 12:00 PM - 3:45 PM & 5:00 PM - 10:00 PM,\n Sunday Closed."),
    Place(4,
        51.5055,
        -0.0865,
        "Hutong",
        "Hutong is an upscale Chinese restaurant located on the 33rd floor of The Shard. The restaurant offers northern Chinese cuisine with a contemporary twist, featuring dishes such as Peking duck, dim sum, and spicy Sichuan specialties. Hutong's interior is inspired by the traditional tea houses of Beijing, and the views of London from the restaurant are breathtaking.",
        "Monday-Sunday 12:00 PM - 10:30 PM."),
    Place(5,
        51.5058,
        -0.0898,
        "Borough Market Kitchen",
        "Borough Market Kitchen is a vibrant food court within the historic Borough Market, offering a diverse range of international cuisines. From artisanal sandwiches and fresh seafood to exotic street food and gourmet desserts, there is something to suit every palate. The bustling atmosphere and variety of food options make it a favorite spot for both locals and visitors.",
        "Monday-Thursday 10:00 AM - 5:00 PM,\n Friday 10:00 AM - 6:00 PM,\n Saturday 8:00 AM - 5:00 PM,\n Sunday Closed."),
    Place( 6,
        51.5067,
        -0.0885,
        "Leon",
        "Leon is a health-conscious fast food restaurant located near London Bridge, known for its Mediterranean-inspired menu that emphasizes natural ingredients and nutritional balance. The menu includes a variety of salads, wraps, and hot boxes, with options for vegetarians, vegans, and meat-eaters alike. It's a popular choice for a quick and wholesome meal.",
        "Monday-Friday 7:00 AM - 9:00 PM,\n Saturday 8:00 AM - 8:00 PM,\n Sunday 9:00 AM - 7:00 PM."),
    Place(7,
        51.5053,
        -0.0869,
        "The Coal Shed",
        "The Coal Shed is a stylish steakhouse and seafood restaurant located near Tower Bridge. It specializes in premium cuts of meat and sustainably sourced fish, all cooked over an open fire for a distinct smoky flavor. The menu includes a variety of steaks, grilled fish, and inventive side dishes, making it a great spot for a hearty and flavorful meal.",
        "Monday-Sunday 12:00 PM - 10:00 PM."),
    Place( 8,
        51.5060,
        -0.0878,
        "Santo Remedio",
        "Santo Remedio is an authentic Mexican restaurant situated near London Bridge, offering a vibrant and colorful dining experience. The menu features traditional Mexican dishes such as tacos, tamales, and quesadillas, all made with fresh ingredients and bold flavors. The restaurant also offers a variety of tequila and mezcal cocktails to complement the meal.",
        "Tuesday-Friday 12:00 PM - 3:00 PM & 5:30 PM - 10:00 PM,\n Saturday 11:30 AM - 3:30 PM & 5:30 PM - 10:00 PM,\n Sunday 11:30 AM - 4:00 PM,\n Monday Closed."),
    Place(9,
        51.5065,
        -0.0873,
        "Arabica Bar & Kitchen",
        "Arabica Bar & Kitchen is a Middle Eastern restaurant located in Borough Market, offering a menu inspired by the flavors of the Levant. Dishes include a variety of meze, grilled meats, and vegetarian options, all made with aromatic spices and fresh herbs. The vibrant atmosphere and delicious food make it a popular spot for both casual dining and special occasions.",
        "Monday-Saturday 11:00 AM - 10:00 PM,\n Sunday 11:00 AM - 6:00 PM.")
)

/**
 * Repository class for managing and accessing place data.
 */
class PlacesRepository {

    /**
     * Retrieves the list of all places.
     *
     * @return A list of Place objects representing various hospitals.
     */
    fun getPlaces(): List<Place> {
        Log.i("mytag", "$PLACES")
        return PLACES
    }

    /**
     * Retrieves a specific place by its ID.
     *
     * @param placeId The ID of the place to be retrieved.
     * @return The Place object with the specified ID, or null if not found.
     */
    fun getPlace(placeId: Int): Place? {
        return PLACES.find { it.id == placeId }
    }
}