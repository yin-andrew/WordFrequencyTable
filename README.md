# WordFrequencyTable


Objective: This program generates a word frequency table of an inputted text file. 

Implementation:
The program reads the inputted text file and processes the strings and characters, mapping them to a certain integer with a hash function.  Each time those words or characters are repeated, the program increments the value associated with that "entry". The resulting hashtable contains words as well as their respective number of appearances within the inputted text file. 

The program implements separate-chaining to deal with collisions but only resizes when the average chain length is > 8, at which point the array doubles and rehashes all of the previous entries. The implementation to decrease the array size is not included because the purpose of the project voids the need for a resize into a smaller array size. 

Example:
Inputting a monologue from Hamlet:

Output: 
```
 (0):  -> [have : 2] -> [troubles, : 1] -> [oppressorâ€™s : 1] -> [grunt : 1] -> [life, : 1] -> [whose : 1]

 (1):  -> [to, : 1] -> [natural : 1] -> [no : 2] -> [the : 22] -> [but : 1]

 (2):  -> [nymph, : 1] -> [arrows : 1] -> [love, : 1] -> [weary : 1] -> [dread : 1] -> [thus : 2] -> [conscience : 1] -> [all; : 1] -> [currents : 1]

 (3):  -> [now! : 1] -> [shuffled : 1] -> [wishâ€™d. : 1] -> [say : 1] -> [them? : 1] -> [fortune, : 1] -> [others : 1]

 (4):  -> [proud : 1] -> [unworthy : 1]

 (5):  -> [lose : 1] -> [in : 3] -> [would : 2] -> [manâ€™s : 1] -> [merit : 1] -> [he : 1]

 (6): null

 (7):  -> [mortal : 1] -> [sleep : 2] -> [opposing : 1] -> [and : 12] -> [be: : 1] -> [despised : 1] -> [might : 1] -> [cast : 1]

 (8):  -> [dreams : 1] -> [rather : 1] -> [moment : 1]

 (9): null

 (10):  -> [is : 3] -> [quietus : 1] -> [bare : 1] -> [will : 1] -> [enterprises : 1] -> [their : 1]

 (11):  -> [end : 2] -> [fly : 1]

 (12):  -> [long : 1] -> [pause: : 1] -> [ay, : 1] -> [office : 1]

 (13):  -> [rememberâ€™d. : 1]

 (14):  -> [who : 2] -> [respect : 1] -> [heir : 1] -> [more; : 1] -> [make : 2] -> [with : 3]

 (15):  -> [orisons : 1] -> [awry, : 1] -> [life; : 1] -> [off : 1] -> [thereâ€™s : 2] -> [arms : 1] -> [time, : 1] -> [spurns : 1]

 (16):  -> [scorns : 1] -> [of? : 1]

 (17):  -> [give : 1] -> [must : 1] -> [for : 2] -> [a : 5] -> [pangs : 1] -> [returns, : 1] -> [than : 1] -> [does : 1]

 (18):  -> [outrageous : 1] -> [slings : 1] -> [pale : 1]

 (19):  -> [ophelia! : 1] -> [be : 2] -> [cowards : 1]

 (20):  -> [my : 1] -> [calamity : 1] -> [come : 1] -> [die, : 1] -> [flesh : 1] -> [â€˜tis : 2] -> [bear : 2] -> [contumely, : 1] -> [after : 1] -> [bourn : 1] -> [resolution : 1]

 (21):  -> [thy : 1] -> [action.â€”soft : 1] -> [lawâ€™s : 1] -> [patient : 1] -> [puzzles : 1] -> [great : 1]

 (22):  -> [us : 3] -> [heart-ache : 1] -> [country : 1]

 (23):  -> [sea : 1] -> [of : 14] -> [suffer : 1] -> [that : 7] -> [wrong, : 1] -> [fardels : 1]

 (24):  -> [nobler : 1] -> [bear, : 1] -> [death, : 1]

 (25):  -> [perchance : 1] -> [against : 1]

 (26):  -> [something : 1] -> [from : 1] -> [ills : 1] -> [sicklied : 1]

 (27):  -> [name : 1] -> [sleep: : 1] -> [not : 2] -> [to : 14] -> [know : 1]

 (28):  -> [fair : 1] -> [death : 1] -> [rub; : 1] -> [sleep; : 2] -> [question: : 1] -> [sweat : 1]

 (29):  -> [makes : 2] -> [whether : 1]

 (30):  -> [this : 2] -> [devoutly : 1] -> [thousand : 1] -> [we : 4] -> [undiscoverâ€™d : 1] -> [oâ€™er : 1]

 (31):  -> [dream: : 1] -> [take : 1] -> [traveller : 1] -> [regard : 1]

 (32):  -> [takes, : 1] -> [himself : 1] -> [under : 1] -> [hue : 1]

 (33):  -> [all : 1] -> [consummation : 1] -> [shocks : 1] -> [be, : 1] -> [delay, : 1]

 (34):  -> [when : 2] -> [die: : 1] -> [mind : 1] -> [his : 1]

 (35):  -> [sins : 1] -> [or : 2] -> [whips : 1] -> [thought, : 1]

 (36):  -> [so : 1] -> [what : 1]

 (37):  -> [turn : 1] -> [coil, : 1] -> [may : 1] -> [those : 1] -> [pith : 1]

 (38):  -> [insolence : 1] -> [bodkin? : 1]

 (39):  -> [you : 1] -> [by : 2] -> [native : 1]
```


