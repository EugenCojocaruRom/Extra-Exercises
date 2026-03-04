EX\_04MAR - Student grade tracker

Create a student grade tracker that uses jagged arrays to store grades for different subjects, where each student might take a different number of subjects.

Create a method that builds and processes such a grade system.

Create a method 'processGrades' that takes two parameters:

&nbsp;- numStudents - number of students

&nbsp;- subjectsPerStudent - array containing how many subjects each student takes

&nbsp;-> Returns a jagged array where:

&nbsp;	> Each row represents a student

&nbsp;	> Each row length matches the number of subjects that student takes

&nbsp;	  -- Fill each element with a grade calculated using this formula: (studentIndex + 1) × 10 + (subjectIndex + 1)

&nbsp;	  -- Formula explanation:

&nbsp;	   -> studentIndex: the array row index (0, 1, 2, ...)

&nbsp;	   -> subjectIndex: the column index within that row (0, 1, 2, ...)

