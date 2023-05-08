## FactsProject

### Maintainability Assessment
The Model View Controller design pattern (MVC) makes it easier to
upgrade and make changes to the software because the softwares
architecture is separated into pieces with distinct responsibilities. Keeping
the Model, View, and Controller separate in the architecture simplifies the
software such that modifications are simpler to implement.
GUI implementation of Facts project 
What to Do Differently
The MVCWrapper.java class was responsible for both the JFrame
implementation and the ActionListener user interaction. To increase the
modularity of the software, the ActionListener implementation may be
conducted in a different class from the JFrame implementation. This would
increase the maintainability of the software
