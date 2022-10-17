    The objective of this lab was to familiarize students with the primary pillars of object-oriented programming, the pillars being encapsulation, inheritance, and 
polymorphism. We were given the freedom to create classes based off any fictional item from fantasy or sci-fi, in my case I chose to create a slightly more ambitious 
project and made a small and simple text-based role-playing game that still upheld the requirements of the project. The classes also had to contain a toString method, 
three instance variables declared as private, a default constructor, a constructor that takes multiple arguments, getters and setters for each class, and at least two 
of our own custom methods for each class. Within the main method of the project we had to declare at least one instance of each of our classes (with one using a 
default constructor and another using a multiple parameter constructor), print the toString methods of each class using System.out.println(), print the results of two 
of our methods unique to each class, change one of our classes instance variables using our setters and print that using our getter mutators, and then print out 
altered objects instance variables using the toString method again.
    The game itself is based off the roleplaying game "Disco Elysium" from the developer ZA/UM. I chose to reference "Disco Elysium" because the game primarily 
consisted of conversations with various characters that would then initiate various dice roles, and thus lend itself very well to having aspects of its gameplay loop 
emulated by a text-based game, though the implementation is still vastly more simplistic than the full game. One example of this simplification can be seen in the 
complete removal of "skills" and the reliance on ability scores for all dice rolls. The scope of this incredibly simple game just did not justify the creation of that 
many instance variables, and most of them would go unused so it was easier to just cut them and use the ability scores by themselves.
  The NPC class is used to instantiate a generic non-player character object that has much more generic information for its default constructor and could be used in 
the future to create more average generic unnamed NPCs more frequently but can also be used to create unique characters in a scene without having to create an entirely 
new class that inherits from it. However, usually the NPC class is used to inherit information that is then used by more specific characters like the MainCharacter for 
example.
  The MainCharacter (referred to in game as "Hobo Cop") class inherits from the NPC class and as the name suggests represents the character that the player actually 
"plays". The MainCharacter class is mostly very similar to the NPC class however it also has various methods it can use to act on the world, that the more generic NPC 
superclass does not possess. These methods are the "move" and the "punch" methods. The Move method simply changes the x and y values of the location coordinates array 
within the MainCharacter class. The Punch methods takes and target, gets its health instance variable, and then lowers it by a value multiplied by the MainCharacter's 
Strength ability score.
  The Item class represents a more generic item within the world and various information that would be shared by inanimate objects within the game. This includes 
variables such as weight, how valuable the item is, who owns an item, and how old the item is. However, objects of the Item class do not have any methods to enact 
change on the world around them by themselves. In order to allow Items to interact on the world around them another more specific item needs to be made to inherit from 
the Item class and be given those methods. The KimsGun class is a good example of this in action, inheriting all the generic information about an object in the world 
from the Item class, while implementing its own Shoot method and ammoInGun instance variable. The Shoot method itself functions very similarily to the Punch method 
used by the MainCharacter class, but also requires a check against the user's ability score "motorics" and requires that the gun has ammo before it can execute 
properly. The Shoot function also decreases the targets health by a much larger set amount instead of depending on the user’s strength score.
  To help keep the main method from becoming to cluttered and hard to parse, the various parts of each conversation were broken up into various helper methods 
contained within a class called "conversation selection" and each of these methods primarily consist of prompts for user input, checks against the MainCharacter's 
ability scores, and player feedback on the results of said checks. This allows the main method to primarily be cleaned up to just the initial instantiation of all 
objects that exist for the entire lifetime of the scene, as well as the initial prompts for user input.
  This result of this project shows how a very simple text game can be made with very little extra effort using all the principles of object-oriented programming. In 
working on this project, I learned an even greater deal from the efforts I made in utilizing helper methods to help make the code base more readable. Prior to breaking 
up the code related to conversation into its own class of helper methods, the project itself was borderline unreadable and unworkable. By utilizing helper methods 
wherever I could I was able to make the project's codebase readable and much easier to iterate on. In the future if I or anyone ever wanted to make this into a full 
game, I would suggest making more open-ended genericized helper methods so that those methods could be more frequently reused. The existing helper methods are far too 
specific to this specific scene and continuing to implement conversations like this would result in an absurd number of different methods within the conversation 
selection class.
