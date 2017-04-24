# EITWIEAPONAP
#### Grace Cuenca, Jonathan Quang, Joshel Xiedeng

## DESIGN
#### Class Ticket (implementing Comparable)
We decided on having 4 attributes: int ID, int problem, int priority, and String username.  Username, as we discussed in class, helps distinguish between tickets.  Problem acts as a storage unit for the integers that represent problems.  Priority is the value that represents the level of priority the request has.  ID, similar to username, also helps distinguish between tickets.

As for the methods, the only other ones besides the constructor, accessors, and mutators are int compareTo & void problemChange.  compareTo returns -1 if the priority of "this" ticket is less than the priority of the input ticket, 1 if it's greater than, and 0 if they're equal.  ProblemChange just changes the value of the problem attribute to the input value.

#### Class HelpDesk (importing cs1.Keyboard)
We decided on just 2 attributes: APQ tickets & int count.  Tickets is just a storage unit for all the requests that are translated into tickets.  Count acts as a counter for the number of tickets that have already been inputed.

There are also only 2 methods: HelpDesk & void calculatePriority.  HelpDesk is just a constructor that instantiates the APQ tickets and sets count to 0.  CalculatePriority takes a ticket as an input and sets its priority as the sum of the value of count and the inputs call to the Ticket method problem; it then adds 1 to count at the end.

## EMBELLISHMENTS
Instead of using Strings to describe the problems in a request, we thought it would be simpler, for both the person who requests and help desk, to represent pre-chosen key words for problems as integers(0 for Hardware problems, 1 for Software problems, 2 for Internet problems, & 3 for Login Credential problems.