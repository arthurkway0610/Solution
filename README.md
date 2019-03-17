# Solution

Test Case A
1a:- Create test case to perform unit test with main method
1b:- Add interface class to force class to create function needed

2a:- add sound for Duck 
2b:- Add Swimmable interface to Duck and add swim force
2c:- add sound for Chicken
2d:- remove fly method from bird and add for Duck only

3a:- add sound for Chicken class
3b:- Rooster is male of Chicken and it do have same attribute and function of Chicken
3c:- add interface to Chicken class and make it have to implements same function as Chicken, however the inheritance can save extra work.

4a,b,c,d:- add a Parrot class which able to accept near by object with Animal or String type to change the sound dynamically.


Test Case B
1a,b,c:- add a Fish class which only implements Swimmable interface and remove Walkable from Animal since not all animal can walk

2:- add attribute size and color to Animal since all animal could have these types of attributes
2a,d:- add a Shark class extends Fish as parent class and add custom method eat, initialize the size as large and color as grey
2b,c:- add a Clownfish class extends Fish as parent class and add custom method joke, initialize the size as small and color as orange


3:- dolphin is animal type so it can have same attribute as Fish like size and color. implements Swimmable interface to allow dolphin contains swim method.
3b:- Animal class contains all basic attribute and function that Fish and Dolphin to save unneeded overhead.


Test Case D
-Create Butterfly and Caterpillar class and initialize the sound as empty value
-add interface Metamorphosable to Class Caterpillar to allow caterpillar metamorphosis to a new butterfly object.