# Q-Manager Console
A console manager for the [q-manager-core](https://github.com/AndreiDodu/q-manager-core) library .

## Command line
Q-Manager can be used from the command line. The commands are the followings:

## Running

To make the executable jar file:

	mvn clean package
	
To run the DBMS:
	
	sudo docker-compose up

To run the application:
	
	java -jar q-manager.jar
	
#### Create a Questionnaire
To create a questionnaire:

	questionnaire create TITLE HELP LANGUAGE_CODE

Where:
 - `TITLE` is the title of your questionnaire
 - `HELP` is the text that describes the questionnaire
 - `LANGUAGE_CODE` the language code of the `TITLE` and `HELP`

If you do not want to specify the `TITLE`, use the `$` symbol to indicate that you don't want to define that field.

To update a questionnaire:

	questionnaire update TITLE HELP LANGUAGE_CODE
	
To list all questionnaires:

	questionnaire list LANGUAGE_CODE
	
To retrieve a single questionnaire:
	
	questionnaire single QUESTIONNAIRE_CODE LANGUAGE_CODE	
	
Where:
 - `QUESTIONNAIRE_CODE` is the questionnaire code found on DB		
	
To delete a questionnaire
	
	questionnaire delete QUESTIONNAIRE_CODE	
	
Where:
 - `QUESTIONNAIRE_CODE` is the questionnaire code found on DB	
 
#### Create a Group
To create a group:

	group create TITLE HELP LANGUAGE_CODE

Where:
 - `TITLE` is the title of your group
 - `HELP` is the text that describes the group
 - `LANGUAGE_CODE` the language code of the `TITLE` and `HELP`

If you do not want to specify the `TITLE`, use the `$` symbol to indicate that you don't want to define that field.

To update a group:

	group update TITLE HELP LANGUAGE_CODE
	
To list all groups:

	group list LANGUAGE_CODE
	
To retrieve a single group:
	
	group single GROUP_CODE LANGUAGE_CODE	
	
Where:
 - `GROUP_CODE` is the group code found on DB		
	
To delete a group
	
	group delete GROUP_CODE	
	
Where:
 - `GROUP_CODE` is the group code found on DB	 
 
#### Create a Section
To create a section:

	section create TITLE HELP LANGUAGE_CODE

Where:
 - `TITLE` is the title of your section
 - `HELP` is the text that describes the section
 - `LANGUAGE_CODE` the language code of the `TITLE` and `HELP`

If you do not want to specify the `TITLE`, use the `$` symbol to indicate that you don't want to define that field.

To update a section:

	section update TITLE HELP LANGUAGE_CODE
	
To list all sections:

	section list LANGUAGE_CODE
	
To retrieve a single section:
	
	section single SECTION_CODE LANGUAGE_CODE	
	
Where:
 - `SECTION_CODE` is the section code found on DB			
	
To delete a section
	
	section delete SECTION_CODE	
	
Where:
 - `SECTION_CODE` is the section code found on DB	  
 
 
#### Create a Questionnaire-Group association
To create a QuestionnaireGroup:

	questionnairegroup create QUESTIONNAIRE_CODE GROUP_CODE ORDER

Where:
 - `QUESTIONNAIRE_CODE` is the questionnaire code
 - `GROUP_CODE` is the group code
 - `ORDER` it the group order 

To update a QuestionnaireGroup:

	questionnairegroup update QUESTIONNAIRE_CODE GROUP_CODE ORDER
	
To list all QuestionnaireGroup records:

	questionnairegroup list QUESTIONNAIRE_CODE
	
To retrieve a single QuestionnaireGroup:
	
	questionnairegroup single QUESTIONNAIRE_CODE GROUP_CODE
	
To delete a QuestionnaireGroup
	
	questionnairegroup delete QUESTIONNAIRE_CODE GROUP_CODE
	
#### Create a Group-Section association
To create a GroupSection:

	groupsection create GROUP_CODE SECTION_CODE ORDER

Where:
 - `GROUP_CODE` is the group code
 - `SECTION_CODE` is the section code
 - `ORDER` it the section order 

To update a GroupSection:

	groupsection update GROUP_CODE SECTION_CODE ORDER
	
To list all GroupSection records:

	groupsection list GROUP_CODE
	
To retrieve a single GroupSection:
	
	groupsection single GROUP_CODE SECTION_CODE
	
To delete a GroupSection
	
	groupsection delete GROUP_CODE SECTION_CODE
		
#### Create a Section-Question association
To create a SectionQuestion:

	sectionquestion create SECTION_CODE QUESTION_CODE ORDER

Where:
 - `SECTION_CODE` is the section code
 - `QUESTION_CODE` is the question code
 - `ORDER` it the question order 

To update a SectionQuestion:

	sectionquestion update SECTION_CODE QUESTION_CODE ORDER
	
To list all SectionQuestion records:

	sectionquestion list SECTION_CODE
	
To retrieve a single SectionQuestion:
	
	sectionquestion single SECTION_CODE QUESTION_CODE
	
To delete a SectionQuestion
	
	sectionquestion delete SECTION_CODE QUESTION_CODE
	
#### Create Question
To create a Question:

	question create TEXT HELP TYPE LANGUAGE_CODE OPTIONS
	
Where:
	 - `TEXT` the question
	 - `HELP` hrlp text
	 - `TYPE` question type (textual, numeric etc.). Allowed values are: NUM|TEXT|STR|DATE|MUL
	 - `LANGUAGE_CODE` language code
   	 - `OPTIONS` if type is MUL, then here we can define options

To update a Question:

	question update EXISTING_QUESTION_CODE TEXT HELP TYPE LANGUAGE_CODE OPTIONS
	
To list all Question records:

	question list LANGUAGE_CODE
	
To retrieve a single Question:
	
	question single EXISTING_QUESTION_CODE LANGUAGE_CODE
	
To delete a Question
	
	question delete QUESTION_CODE
	   	 
				