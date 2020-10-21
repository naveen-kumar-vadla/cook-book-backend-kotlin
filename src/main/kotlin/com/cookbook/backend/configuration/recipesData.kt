package com.cookbook.backend.configuration

import com.cookbook.backend.model.Recipe

val recipe_1 = Recipe(
    userId = 5,
    name = "fresh applesauce",
    imageUrl = "https://www.shopfamilyfare.com/sites/default/files/styles/recipe_thumbnail_responsive_2x/public/recipes/Fresh-applesauce-R.jpg?itok=kS9nGQDG",
    category = "Breakfast",
    serves = "6",
    prepTime = "15",
    cookTime = "10",
    totalTime = "25",
    ingredients = arrayOf(
        "8 apples (such as Braeburn or Jonathan), cored, peeled and chopped",
        "1/2 cup sugar",
        "1 tbsp. ground cinnamon",
        "Juice of 1/2 lemon",
        "1 tsp. vanilla extract"
    ),
    instructions = arrayOf(
        "Place apples in a 5-quart pot. Add sugar, cinnamon, lemon juice and vanilla. Add just enough water to cover half the apples (to prevent a watery sauce).",
        "Bring apples to boiling; reduce heat. Simmer until apples are soft about 10 to 12 minutes.",
        "Hand-blend or mash apples to desired consistency. Serve warm or cold."
    )
)

val recipe_2 = Recipe(
    userId = 1,
    name = "loaded chilli cheese fries",
    imageUrl = "https://www.shopfamilyfare.com/sites/default/files/styles/recipe_thumbnail_responsive_2x/public/recipes/LoadedChiliCheeseFries-catalog.jpg?itok=niLleZCv",
    category = "Snacks",
    serves = "6",
    prepTime = "",
    cookTime = "",
    totalTime = "40",
    ingredients = arrayOf(
        "1 ea. Bag Our Family Crinkle Cut French Fries",
        "1 ea. Bag Thick Cut Mexican Blend Cheese (8 oz)",
        "1 ea. Open Acres Beef Chili Soup",
        "1 ea. Avocado, halved, peeled and diced",
        "1 cup Fresh Divide Pico de Gallo",
        "1/2 Lime, cut into wedges (garnish)",
        "1 cup Our Family Sour Cream",
        "1/4 cup Pickled jalapenos"
    ),
    instructions = arrayOf(
        "cook french fries according to instructions on the bag.",
        "Before you remove the fries from the oven, evenly distribute cheese over the fries. Put back in oven to melt for 2 minutes.",
        "In a small sauce pot, heat chili per instructions on the container.",
        "Transfer cheese fries to a serving vessel. Top with chili and remaining toppings.",
        "Garnish with limes and enjoy!"
    )
)

val recipe_3 = Recipe(
    name = "Singapore Noodle and Chicken Lettuce Cups",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Singapore%20noodle%20chicken%20lettuce%20cups_2169.jpg?itok=Jl5iYMKz",
    category = "Sauces",
    serves = "4",
    prepTime = "15 minutes",
    cookTime = "20",
    totalTime = "35",
    userId = 2,
    ingredients = arrayOf(
        "2 sweet potatoes (350g each)",
        "1 pinch of dried chilli flakes",
        "1 pinch of ground coriander",
        "1 small pinch of ground cinnamon",
        "olive oil",
        "200 g quinoa",
        "320 g broccoli",
        "35 g mixed nuts such as walnuts, almonds, Brazils",
        "1 pomegranate",
        "extra virgin olive oil",
        "1 splash of balsamic vinegar",
        "2 limes",
        "40 g mixed sprouts",
        "1 punnet of salad cress (use a mixture of varieties, if possible)",
        "1 bunch of fresh coriander (30g)",
        "1 fresh red chilli",
        "1 ripe avocado",
        "20 g feta cheese"
    ),
    instructions = arrayOf(
        "Preheat the oven to 200°C/400°F/gas 6.",
        "Scrub and chop the sweet potatoes into 2.5cm chunks. Place into a roasting tray with the chilli flakes, ground coriander and cinnamon, a drizzle of olive oil and a little sea salt and black pepper, then toss well.",
        "Spread out into an even layer and place in the hot oven for 15 to 20 minutes, or until golden and crisp.",
        "Meanwhile, cook the quinoa in boiling salted water according to the packet instructions.",
        "Slice the broccoli into small florets, then halve and finely slice the stalk. Place into a heatproof colander and rest it over the quinoa pan. Cover and steam for 3 minutes, or until just tender.",
        "Once cooked, drain and rinse the quinoa under cold running water, then leave to cool along with the broccoli. Remove the sweet potato from the oven and leave it to cool, too.",
        "Meanwhile, toast the nuts in a dry frying pan over a medium-high heat for 2 to 3 minutes, then transfer to a pestle and mortar and crush lightly.",
        "Halve the pomegranate and squeeze half the juice into a large bowl. Add 3 times as much extra virgin olive oil, the lime juice and balsamic vinegar. Whisk well and season to taste.",
        "Add the cooled broccoli and sprouts to the dressing, then snip in the cress. Roughly chop the coriander (stalks and all), finely slice the chilli and add to the bowl along with the quinoa and sweet potato.",
        "Toss well, spread out on a serving platter, then scoop out and dot over the avocado flesh.",
        "Bash the reserved pomegranate half with a wooden spoon so the seeds come tumbling out and scatter these over the platter along with the nuts, snip the cress on top, then serve with the feta crumbled over the top."
    )
)

val recipe_4 = Recipe(
    name = "Superfood salad",
    imageUrl = "http://cdn.jamieoliver.com/recipe-database/oldImages/xtra_med/1460_1_1436891540.jpg",
    category = "Salad",
    serves = "6",
    cookTime = "",
    prepTime = "",
    totalTime = "40",
    userId = 5,
    ingredients = arrayOf(
        "1 iceberg lettuce",
        "375g Singapore noodles",
        "2 teaspoons vegetable oil",
        "1 carrot, finely diced",
        "1 stick celery, finely diced",
        "1 red capsicum, finely diced",
        "1 barbecue chicken, meat shredded",
        "200g Passage to Asia Singapore Noodles Stir-fry Sauce",
        "4 green onions, thinly sliced diagonally",
        "Fried shallots, to serve"
    ),
    instructions = arrayOf(
        "Holding lettuce between your hands, firmly bang core on a flat surface. Twist and remove core. Place lettuce into a large bowl of icy cold water. (This will make it easier to separate leaves). Drain well.",
        "Heat oil in a non-stick frying pan over medium heat. Add carrot, celery and capsicum. Cook for 4 minutes or until soft. Add chicken, Passage to Asia Singapore Noodles Stir-fry Sauce, ½ cup water and ¾ green onions. Bring to the boil. Cook for 2 minutes. Add noodles and toss until well combined.",
        "Trim lettuce leaves with scissors and place onto a large platter. Spoon noodle mixture into leaves. Sprinkle with remaining green onions and fried shallots and serve."
    )
)

val recipe_5 = Recipe(
    name = "Huevos Rancheros (Mexican baked eggs)",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Huevos-Rancheros_2709.jpg?itok=efkmy8zT",
    category = "Brunch",
    serves = "4",
    prepTime = "15",
    cookTime = "30-35",
    totalTime = "45-50",
    userId = 3,
    ingredients = arrayOf(
        "2 tablespoons olive oil",
        "1 brown onion, finely chopped",
        "½ teaspoon chilli flakes",
        "1 teaspoon smoked paprika",
        "2 teaspoons ground cumin",
        "Salt and pepper, to season",
        "1 large (300g) red capsicum, deseeded, finely chopped",
        "400g kidney beans, drained, rinsed",
        "400g can diced tomatoes",
        "½ cup (125ml) water",
        "4 eggs, at room temperature",
        "½ cup coriander leaves",
        "1 avocado, thinly sliced",
        "Sour cream, lime wedges and small toasted tortillas, to serve"
    ),
    instructions = arrayOf(
        "Preheat oven to 180°C (160°C fan forced). Heat oil in a large non-stick frying pan over medium heat. Add onion, chilli, smoked paprika, cumin, salt and pepper and cook for 4-5 minutes, or until softened.",
        "Add capsicum, kidney beans, tomatoes and water and bring to the boil. Reduce heat to a simmer and cook, stirring occasionally, for 8-10 minutes, or until thickened.",
        "Spoon the mixture into four 1 cup-capacity ovenproof dishes. Make an indentation into each bean mixture, and crack an egg into each.",
        "Bake for 15-18 minutes or until the egg is cooked to your liking. Serve with coriander, avocado, sour cream, lime and tortillas."
    )
)

val recipe_6 = Recipe(
    name = "Cauliflower Steaks with Herbed Scramble",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/cauliflower%20steaks%20with%20herbed%20scramble%202946.jpg?itok=ZNqW_rLh",
    category = "Vegetarian",
    serves = "4",
    prepTime = "5",
    cookTime = "10",
    totalTime = "15",
    userId = 4,
    ingredients = arrayOf(
        "1 head cauliflower, cut into 1.5cm-thick steaks",
        "Olive oil spray",
        "8 eggs",
        "1/2 cup milk",
        "35g butter, chopped",
        "1 cup mixed chopped herbs (such as coriander, parsley)",
        "60g baby spinach",
        "3 green onions, thinly sliced",
        "Lemon wedges, to serve",
        "Steamed brown rice and tomato salad, to serve (optional)"
    ),
    instructions = arrayOf(
        "Preheat a grill pan or chargrill on high. Spray cauliflower with oil. Cook the cauliflower steaks on the grill for 5 minutes each side or until charred and tender.",
        "Meanwhile, place the eggs and milk into a large bowl. Whisk until frothy and combined.",
        "Melt butter in a large non-stick fry pan over a medium heat. Once melted, add the egg mixture and stir gently with a wooden spoon for 2-3 minutes or until the eggs are just set. Stir in herbs. Remove the pan from the heat. Season with salt and pepper.",
        "Serve cauliflower steaks with herbed scramble and spinach. Scatter with extra herbs, green onion and lemon wedges. Serve with steamed brown rice and tomato salad, if you like."
    )
)

val recipe_7 = Recipe(
    name = "AAVOCADO BREAKFAST SMOOTHIE",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/carousel_large/public/recipe_photo/Smoothie-Avo-Group-Portrait.jpg?itok=k7tcqv1G",
    category = "Drinks",
    serves = "2-3",
    prepTime = "10",
    cookTime = "",
    totalTime = "10",
    userId = 4,
    ingredients = arrayOf(
        "1 medium banana, chopped",
        "1 avocado",
        "2 cups ice",
        "1 cup coconut water",
        "1 tablespoon honey"
    ),
    instructions = arrayOf(
        "Place banana, avocado, ice, coconut water and honey in a blender and blend on high speed until smooth. Pour into glasses to serve."
    )
)

val recipe_8 = Recipe(
    name = "TROPICAL BREAKFAST SMOOTHIE",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/carousel_large/public/recipe_photo/Smoothie-Avo-Group-Portrait.jpg?itok=k7tcqv1G",
    category = "Drinks",
    serves = "2-3",
    prepTime = "10",
    cookTime = "",
    totalTime = "10",
    userId = 3,
    ingredients = arrayOf(
        "1 medium banana, chopped",
        "1 avocado",
        "1 cup coconut water",
        "1 tablespoon honey",
        "3 cups frozen mango pieces",
        "1 cup frozen pineapple pieces",
        "1 cup coconut milk",
        "Fresh mango wedges (optional) and desiccated coconut, to serve"
    ),
    instructions = arrayOf(
        "Place banana, avocado, coconut water, honey, mango, pineapple and coconut milk in a blender and blend on high speed until smooth. Pour into glasses and serve topped with mango wedges and coconut if you like"
    )
)

val recipe_9 = Recipe(
    name = "RASPBERRY BREAKFAST SMOOTHIE",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/carousel_large/public/recipe_photo/Smoothie-Avo-Group-Portrait.jpg?itok=k7tcqv1G",
    category = "Drinks",
    serves = "2-3",
    prepTime = "10",
    cookTime = "",
    totalTime = "10",
    userId = 3,
    ingredients = arrayOf(
        "1 medium banana, chopped",
        "1 avocado",
        "1 cup coconut water",
        "1 tablespoon honey",
        "2 cups frozen raspberries",
        "1⁄4 cup Greek yoghurt, plus extra to serve"
    ),
    instructions = arrayOf(
        "Place banana, avocado, coconut water, honey, raspberries and yoghurt in a blender and blend on high speed until smooth. Pour into glasses and top with extra yoghurt to serve"
    )
)

val recipe_10 = Recipe(
    name = "Chicken and Prawn Pad Thai",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Pad-Thai_10018.jpg?itok=DC2HXQUy",
    category = "Chicken",
    serves = "4",
    prepTime = "20",
    cookTime = "20",
    totalTime = "40",
    userId = 5,
    ingredients = arrayOf(
        "375g pad Thai noodles",
        "2 tbs vegetable oil",
        "16 green prawn, peeled, deveined",
        "500g chicken thigh fillet, diced",
        "2 eggs, whisked",
        "5 green onions, thinly sliced diagonally",
        "200g Passage to Asia Pad Thai Stir-fry sauce",
        "1 cup bean sprouts, trimmed",
        "Small red chillies, thinly sliced, to serve",
        "Thai basil, to serve"
    ),
    instructions = arrayOf(
        "Cook rice noodles as per packet instructions",
        "Heat 1 tbs oil in a hot wok. Add prawns and cook for 3 minutes or until just cooked. Transfer to a bowl. Add chicken and cook for 5 minutes or until browned and cook through. Transfer to bowl with prawns",
        "Heat remaining oil. Add egg and cook for 1 minute or until just set. Add onion and stir until combined. Return chicken, prawns and noodles to wok with Passage to Asia Pad Thai Stir-fry Sauce. Toss until well combined and heated through. Remove from heat and stir in bean sprouts. Spoon into serving bowls and top with chilli and basil"
    )
)

val recipe_11 = Recipe(
    name = "One-pan Coconut Chettinad Prawn Curry",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/One%20pan%20coconut%20Chettinad%20prawns%202586.jpg?itok=RRTuceRX",
    category = "Sea-Food",
    serves = "4",
    prepTime = "10",
    cookTime = "20",
    totalTime = "30",
    userId = 5,
    ingredients = arrayOf(
        "450g peeled, deveined green king prawns",
        "225g pkt Street Kitchen Coconut Chicken Chettinad Kit",
        "2 tbsp vegetable oil",
        "250g punnet cherry tomatoes",
        "165ml tin coconut milk",
        "450g pkt family size microwave basmati rice",
        "2 x birdseye chillies, thinly sliced",
        "Coriander leaves, to serve",
        "Lime wedges, to serve"
    ),
    instructions = arrayOf(
        "Place prawns in a bowl and add the ginger & garlic paste from the Street Kitchen pack. Stir to coat.",
        "Heat 1 tbsp of the oil in a large non-stick lidded frying pan over medium high heat. Add the prawns and cook, stirring, for 2-3 minutes or until lightly coloured. Transfer to a plate",
        "Heat remaining oil in the pan and add the Street Kitchen spices. Cook for 1-2 minutes or until aromatic. Add the tomatoes and cook over high heat for 2 minute or until starting to split. Pour in the curry sauce and bring to a simmer. Stir in 1 cup of water and the coconut milk. Add the rice, stir to combine, cover and cook for 10 minutes or until the rice is almost cooked.",
        "Return prawns and chilli to the pan, gently stir to combine. Cover and cook for a further 2 minutes or until the rice and prawns are cooked",
        "Serve the prawns and rice, scattered with remaining chilli, coriander and lime wedges."
    )
)

val recipe_12 = Recipe(
    name = "Chicken Fried Rice with Sliced Egg Omelette",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Chicken%20fried%20rice%202560_0.jpg?itok=kVwsKTAp",
    category = "Rice",
    serves = "4",
    prepTime = "15",
    cookTime = "15",
    totalTime = "30",
    userId = 5,
    ingredients = arrayOf(
        "2 tablespoons peanut oil",
        "4 eggs, lightly beaten",
        "250g chicken breast, thinly sliced",
        "1 red capsicum, diced",
        "150g (1 cup) frozen peas",
        "4 shallots, thinly sliced",
        "150g sugar snap peas, blanched",
        "2 garlic cloves, crushed",
        "450g pkt microwave jasmine rice, warmed",
        "¼ cup (60ml) kecap manis (sweet soy sauce)",
        "2 tablespoons Chinese rice wine",
        "1 teaspoon sesame oil",
        "Toasted sesame seeds, to serve"
    ),
    instructions = arrayOf(
        "Heat 2 teaspoons peanut oil in a wok or large deep non-stick frying pan over medium heat. Add 2 eggs and swirl around the pan to form a thin omelette. Cook for 1-2 minutes or until just set. Transfer to a board, roll and slice thinly. Repeat with 2 teaspoons oil and remaining eggs to make 2 omelettes.",
        "Add remaining peanut oil to wok and return to high heat. Stir-fry chicken for 2-3 minutes or until golden. Add capsicum, peas, half the shallots, sugar snap peas and the garlic and stir-fry for 1-2 minutes or until just tender. Add rice and stir-fry for 2 minutes or until heated through.",
        "Mix together half the kecap manis, rice wine and sesame oil and add to the wok, tossing gently until well combined. Fold through half the sliced omelette.",
        "To serve, divide the rice between bowls and top with remaining sliced omelette, remaining shallots and scatter of sesame seeds. Drizzle with remaining kecap manis."
    )
)

val recipe_13 = Recipe(
    name = "Tea eggs with Asian noodles",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Tea-eggs_3326.jpg?itok=C8Z1unmk",
    category = "Noodles",
    serves = "4",
    prepTime = "15 (plus 120min for cooling)",
    cookTime = "20",
    totalTime = "35 (plus 120min for cooling)",
    userId = 5,
    ingredients = arrayOf(
        "1 tablespoon Chinese five spice",
        "1 cup (250ml) dark soy",
        "3/4 cup brown sugar",
        "¼ rice wine vinegar",
        "2 black tea bags",
        "2 cups (500ml) water",
        "8 eggs, at room temperature",
        "350g fresh egg noodles",
        "2 tablespoons sesame oil",
        "1 bunch broccolini, trimmed",
        "200g Asian mushrooms chopped",
        "1 tablespoon sliced ginger",
        "4 green onions, shredded",
        "1 long red chilli, thinly sliced",
        "Baby purple shiso, optional, to serve"
    ),
    instructions = arrayOf(
        "Place Chinese five spice, soy, brown sugar, vinegar and tea bags in a medium saucepan. Add the water and bring to the boil over high heat.",
        "Add the eggs and cook for 3 minutes. Carefully remove with a slotted spoon. Place in a bowl and gently tap the shell with the back of a spoon. Return the eggs to the boiling cooking liquid and remove from heat. Cover and leave for at least 2 hours to marinate and cool.",
        "Remove 1 cup of the cooking liquid and set aside. Discard remaining cooking liquid.",
        "Cook noodles according to packet instructions. Refresh and set aside.",
        "Heat oil in a large wok or frying pan. Add broccolini and cook for 3 minutes, then add mushrooms. Cook for another 3 minutes. Add ginger and reserved cooking liquid and cook for 1 minute.",
        "To serve, peel the eggs and halve some of them. Divide noodles and vegetables between bowls. Drizzle with cooking liquid. Top with eggs, scatter with green onions, chilli and shiso."
    )
)

val recipe_14 = Recipe(
    name = "Persian Love Cake",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Australian%20Eggs%20Persian%20Love%20Cake%202.jpg?itok=3cflzKzI",
    category = "Cakes",
    serves = "12",
    prepTime = "35",
    cookTime = "55 (plus cooling time)",
    totalTime = "90",
    userId = 5,
    ingredients = arrayOf(
        "2 cups (240g) almond meal",
        "¾ cup (110g) self-raising flour",
        "300g butter, at room temperature",
        "1 ¼ cups (275g) firmly packed brown sugar",
        "2 tsp vanilla extract",
        "1 ¼ tsp ground cinnamon",
        "1 ¼ tsp ground ginger",
        "1 tsp ground cardamom",
        "2 tsp rosewater",
        "6 eggs",
        "250g butter, softened, room temperature",
        "500g icing sugar mixture",
        "1 tsp vanilla extract",
        "3 tsp rosewater, or to taste",
        "1 tbsp milk",
        "Pink food colouring, to tint",
        "Turkish delight, pistachios, raspberries, gold leaf and dried rose petals, to decorate"
    ),
    instructions = arrayOf(
        "Meanwhile, using an electric mixer, beat butter in a bowl until pale and creamy. Gradually add icing sugar mixture, beating constantly until combined. Add vanilla and rosewater. Tint pale pink with colouring. Beat until combined",
        "Cut cake in half horizontally. Place cake base on a serving plate. Pipe or spread over half the buttercream. Top with cake top. Pipe or spread with remaining buttercream. Decorate with Turkish delight, pistachios, raspberries, gold leaf and dried rose petals. Serve",
        "Preheat oven to 180°C/160°C fan-forced. Grease a round 22cm diameter cake pan. Line base and sides with baking paper. Combine almond meal and flour in a bowl and set aside",
        "Using an electric mixer, beat butter, sugar, vanilla, cinnamon, ginger, cardamom and rosewater in a large bowl until pale and creamy. Add eggs, 1 at a time, beating after each addition. Fold in almond meal mixture until combined",
        "Spoon mixture into prepared pan. Smooth surface. Bake for 50-55 minutes or until a skewer inserted into the centre of the cake comes out clean. Set aside in pan for 10 minutes to cool before turning onto a wire rack to cool completely"
    )
)

val recipe_15 = Recipe(
    name = "Easy Custard Berry Trifle",
    imageUrl = "https://myfoodbook.com.au/sites/default/files/styles/single_recipe/public/recipe_photo/Custard-berry-trifle_3150.jpg?itok=iOxdGGpZ",
    category = "Dessert",
    serves = "6",
    prepTime = "25",
    cookTime = "10",
    totalTime = "35",
    userId = 5,
    ingredients = arrayOf(
        "300ml pure cream",
        "300ml milk",
        "6 egg yolks",
        "2 tablespoons cornflour (see tip)",
        "1 teaspoon vanilla bean paste",
        "75g (1/3 cup) caster sugar",
        "2 teaspoons finely grated orange zest, plus extra zest to serve",
        "9 jam mini rolls, cut into 3cm slices",
        "250g fresh strawberries, hulled, halved",
        "125g fresh blueberries",
        "250g fresh raspberries",
        "2 tablespoons chopped pistachio kernels",
        "300ml thickened cream, whipped"
    ),
    instructions = arrayOf(
        "Combine cream and milk in a medium saucepan over medium heat and bring to just a simmer.",
        "Meanwhile, whisk yolks, cornflour, vanilla and sugar together in a large heatproof bowl. Gradually whisk in the hot cream mixture until smooth.",
        "Return mixture to cleaned saucepan and place over low heat. Cook, stirring constantly, until custard thickens and thickly coats the back of a spoon.",
        "Serve warm or transfer to a glass bowl and cover surface with plastic wrap (to prevent a skin from forming). Set aside to cool then refrigerate for up to 3 days.",
        "Stir orange zest through the chilled custard.",
        "Layer half the jam roll slices on the base of a 2 litre (8-cup) capacity serving dish, pressing the cut surface of the rolls against the glass. Top with one-third of the custard. Layer three-quarters of the strawberries in the custard, pressing halves against the glass, and scatter with three-quarters of the blueberries. Repeat with another one-third of the custard and remaining jam rolls. Add remaining custard to top of jam rolls.",
        "Top the trifle with dollops of cream. Scatter with raspberries and remaining strawberries and blueberries, pistachios and extra orange zest. Cover and refrigerate until required."
    )
)