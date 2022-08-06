# Q-Manager
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