CREATE VIEW [dbo].[View]
	AS SELECT subject_name as [Name of subject], count(Student_subject.subjectId) as ocurencies FROM Student_subject 
LEFT JOIN Subjects st ON Student_subject.subjectId = st.subjectID 
GROUP BY subject_name