--Create tables
CREATE TABLE Subjects(subjectID int IDENTITY(0,1) PRIMARY KEY,
shortcut VARCHAR(8),
subject_name VARCHAR(50))

CREATE TABLE Students(studentID int IDENTITY(0,1) PRIMARY KEY,
firstname VARCHAR(20),
secondname VARCHAR(50),
born_date DATE)

CREATE TABLE Student_subject(studentID int FOREIGN KEY REFERENCES Students(studentID),
subjectId int FOREIGN KEY REFERENCES Subjects(subjectID),
review_date DATE,
mark int check(mark >= 0 and mark <= 5),
PRIMARY KEY (studentID , subjectId))


-- insret students
INSERT INTO Students VALUES ('Jan', 'Novak', '2000-01-11')
INSERT INTO Students VALUES ('Eva', 'Novakova', '2000-02-09')
INSERT INTO Students VALUES ('Dan', 'Novak', '2000-03-28')
INSERT INTO Students VALUES ('Lukas', 'Novak', '2000-04-25')
INSERT INTO Students VALUES ('Alena', 'Novakova', '2000-05-19')
INSERT INTO Students VALUES ('Pavel', 'Novak', '2000-05-07')
SELECT * FROM Students
--insert subjects
INSERT INTO Subjects VALUES ('BPC-OOP', 'Object-Oriented Programming')
INSERT INTO Subjects VALUES ('BPC-PC1T', 'Computers and Programming 1')
INSERT INTO Subjects VALUES ('BPC-PC2T', 'Computers and Programming 2')
SELECT * FROM Subjects
--insert students for PC1T
INSERT INTO Student_subject VALUES (0,1, '2021-04-14', 1)
INSERT INTO Student_subject VALUES (1,1, '2021-04-14', 3)
INSERT INTO Student_subject VALUES (3,1, '2021-04-14', 5)
--insert students for PC2T
INSERT INTO Student_subject VALUES (2,2, '2021-04-14', 1)
INSERT INTO Student_subject VALUES (3,2, '2021-04-14', 2)
INSERT INTO Student_subject VALUES (4,2, '2021-04-14', 3)
INSERT INTO Student_subject VALUES (5,2, '2021-04-14', 4)
--insert students for OOP
INSERT INTO Student_subject VALUES (4,0, '2021-04-14', 2)
INSERT INTO Student_subject VALUES (5,0, '2021-04-14', 0)

SELECT * FROM Student_subject




-- show all students and ther subjects
SELECT firstname as [First name], secondname as [Second name], born_date as [Born], shortcut, 
subject_name as [Name of subject] FROM Students st LEFT JOIN
Student_subject ss ON st.studentID = ss.studentID LEFT JOIN Subjects sb ON sb.subjectID = ss.subjectId

-- show ocurencies of second name
SELECT secondname as [Second name] , count(secondname) as ocurencies FROM Students GROUP BY secondname

-- show name f subject which have less than 3 students
SELECT subject_name as [Name of subject], count(Student_subject.subjectId) as ocurencies FROM Student_subject 
LEFT JOIN Subjects st ON Student_subject.subjectId = st.subjectID 
GROUP BY subject_name HAVING COUNT(Student_subject.subjectId) < 3

-- show min, max average for every subjects and number of marked students and number of all students 
SELECT subject_name as [Name of subject], MIN(NULLIF(mark,0)) as [Best mark], MAX(mark) as [Worst mark], 
CAST(AVG(CAST(NULLIF(mark,0) AS DECIMAL(10,2))) AS DECIMAL(10,2)) as [Average mark],
count(NULLIF(mark,0)) as [Number of marked students], count(mark) as [Number of students]
FROM Student_subject 
LEFT JOIN Subjects st ON Student_subject.subjectId = st.subjectID
GROUP BY subject_name




-- help query

--DELETE FROM student_subject
--DELETE FROM Students
--DELETE FROM Subjects
--DROP TABLE student_subject
--DROP TABLE Students
--DROP TABLE Subjects