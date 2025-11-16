
Class Diagram
+----------------+        +----------------+        +-------------------+
|   Student      |<>------|   Subject      |        |  GradeCalculator  |
+----------------+        +----------------+        +-------------------+
| - name         |        | - name         |        |                   |
| - subjects[]   |        | - marks        |        |                   |
+----------------+        +----------------+        +-------------------+
| +getSubjects() |        | +getMarks()    |        | +calculateGrade() |
+----------------+        +----------------+        +-------------------+

Relationships:
- Student aggregates multiple Subject objects.
- GradeCalculator computes results for a Student.


Object Diagram
+-------------------+
|   Student: John   |
+-------------------+
| subjects:         |
|  - Maths: 90      |
|  - Science: 85    |
+-------------------+

+-------------------+    +-------------------+
| Subject: Maths    |    | Subject: Science  |
+-------------------+    +-------------------+
| marks: 90         |    | marks: 85         |
+-------------------+    +-------------------+


Sequence Diagram
Student           GradeCalculator
   |                     |
   |---requestGrade()--->|
   |                     |
   |<--calculateGrade()--|
   |                     |
   |<---return grade-----|
   |                     |