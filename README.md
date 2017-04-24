# EITWIEAPONAP
#### Grace Cuenca, Jonathan Quang, Joshel Xiedeng

## DESIGN
#### Class Ticker (implementing Comparable)
We decided on having 4 attributes: int ID, int problem, int priority, and String username.  Username, as we discussed in class, helps distinguish between tickets.  Problem acts as a storage unit for the integers that represent problems.  Priority is the value that represents the level of priority the request has.  ID, similar to username, also helps distinguish between tickets.

As for the methods, the only other ones besides the constructor, accessors, and mutators are int compareTo & void problemChange.  compareTo returns -1 if the priority of "this" ticket is less than the priority of the input ticket, 1 if it's greater than, and 0 if they're equal.  problemChange just changes the value of the problem attribute to the input value.

#### Class HelpDesk (importing cs1.Keyboard)
>>>>> INSERT INFO <<<<<

## EMBELLISHMENTS
>>>>> INSERT INFO <<<<<