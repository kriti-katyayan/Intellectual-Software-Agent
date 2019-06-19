# B.Tech Second Year Project 
Team Size : 4 

# Introduction

1.1 Purpose

The purpose of this document is to present a detailed description of the Intellectual Software Agent. It will explain the purposes and features of the system, the interface, the constraints and how the Application will operate.

1.2 Document Conventions

This document follows MLA Format. Bold-faced text has been used to emphasize section and subsection headings. Highlighting is to point out words in the glossary and italicized text is used to label and recognize diagrams.

1.3 Intended Audience and Reading Suggestions

The Intelligence Software Agent is intended for all those people who travel and often need to comprehend different languages. It is also beneficial for learners and students who wish to study through audio files.
This document is to be read by the development team, the project managers, marketing staff, testers and documentation writers. The SRS has been organized approximately in order of increasing specificity.

1.4 Project Scope: The Vision Statement

The product aims to make communication between people easier through its translation feature. It is a user-friendly software.
Another feature of this software is that it can convert text to speech, that is, it can make audio files from text input; aimed to make learning more fun and easier.

1.5 References

1. Beginning Android Programming 4th Edition-J.F. Marzio
2. Java Reference 9th Edition - Tata McGraw Hill Publications
3.YouTube Channel-The new Boston




# Overall Description












 

2.1 Product Perspective

The software is self-contained. The Intellectual Software Agent is designed to translate sentences in a particular language to another language. The input can be in the form of an ‘image’ or a ‘document file’.
The other feature of Intellectual Software Agent is to make audio files out of input text or any uploaded file. It is particularly focused on making English audio files.

2.2 Product Features

The basic product functions are as follows:

2.2.1 Language Emulator/Translator:

1.Taking the input from the user via ‘image’ upload or ‘document upload’ feature.
2.Processing the input to identify the language and notifying the user.
3.Translating the language to the desired language (inputted by the user).
4.Displaying the translated language contents.

2.2.2 Text to Speech Converter:

1.Taking the input from the user via a ‘document’ upload.
2.Processes the data input and converts it into an audio file.

2.3 User Classes and Characteristics

2.3.1 Customer:

 Remote customers most frequently use the device for language translation and sign interpretation purposes. The customers are not expected to have a high educational and proficiency level or technical expertise. Hence, the user interfaces in available in eight popular international languages such as English, French, German, Spanish, Mandarin, Japanese, Arabic and Hindi. 

2.4 Operating Environment

The operating environment of the software is Android version 4.3 and above. The software is an android application and has the following system requirements-
1.Minimum disk space required is 6MB.
2.Storage: modify or delete the contents of your USB storage; read the contents of your USB storage;
3.Full network access.
4.Access to speakers.

2.5 Design and Implementation Constraints

The software has the following limitations:




1.The text to speech feature recognizes and converts only English Language.
2.Memory: device will have 2GB internal hard drive. Software and database cannot exceed this amount. Device will have a SD card slot, and the software must be able to read and write to that slot.
3.Language requirements: software must be multilingual, including the following languages: English, French, German, Spanish, Mandarin, Japanese, Arabic, Hindi etc.

2.6 Process Model

The process model implemented for this software is: Incremental Model.
The Intellectual Software Agent follows the Incremental Model as the development of the different modules will be re-evaluated and tested in iterative manner. The planning phase for each module will be carried out separately. 


 

1.Development, Testing and Debugging of Language Emulator.
2.Development, Testing and Debugging of Text to Speech Converter.
3.Combining the module and testing the end-product.

2.7 Assumptions and Dependencies

The software is developed keeping in mind the following assumptions: 
1.The user is having an active internet connection.
2.The user will input a valid text input only via ‘image upload’ or ‘document upload’.
3.It is assumed that the software designed will work correctly.
4.The system shall provide the option to take a picture.
5. The system shall display the currently viewed image. 
6. The system shall indicate a need for repair if broken.
7. The input file for Text to speech should be a valid text file (i.e. PDF, TXT).

The software has the following dependency factors-
1.The text to speech converter requires the user input to be in English only.
2.The language translator will process the language to translate only after a valid recognition of the input language. 
3. The software will be able to process and translate/convert to audio file only limited amount of text. The maximum word limit is 100 words.



 # System Features


The software has the following functional requirements for the product by system features, the major services provided by the product. The organization of requirements is on the basis of use cases for the software. 

3.1 Language Emulator/ Translator

3.1.1 Description and Priority
The language translator is meant to process the input language, decipher the characters and identity the language. It then will translate the language into the desired language (specified by the user).
The priority of this module is medium.

3.1.2 Stimulus/Response Sequences
The stimulus for the module is an ‘image’ or a ‘document’. The software will process and display the translated contents.

3.1.3 Functional Requirements

3.1.3.1. Retrieving Inputs:
Purpose: The software will receive inputs in the form of a document or an image.
Input: The image file or the document.
Output: The language of the particular uploaded file will be recognized.

3.1.3.2. Real-time processing- Language Detection:
Purpose: Processing of ‘Image file’ or ‘Document file’. 
Input: The user uploads the ‘image file’ or ‘document file’ to the software for processing.
Output: The software processes the language, deciphers the characters and give the output as the language recognized.


3.1.3.3 Real-time processing- Language Translation:
Purpose: Translating the deciphered language into the desired language.
Input: The user specifies the language to which he needs the translate. The software starts processing.
Output: The translated text is displayed on the screen.

3.2 Text-to-Speech Converter

3.2.1 Description and Priority
The text-to-speech converter is meant to process the input ‘text’ and convert it into an audio file. The language processed by this module is English only. The module has a medium priority.

3.2.2 Stimulus/Response Sequences
The stimulus of the module is input text and response after processing would be the audio file. 

3.2.3 Functional Requirements

3.2.3.1. Retrieving Inputs:

Purpose: Uploading the ‘Text’ to process into the audio file.
Input: The user will upload the ‘text document’ to be translated into an audio file. The file must in English language only.
Output: The user gets the an mp3 audio file in English.

3.2.3.2. Real-time Processing:

Purpose: Converting the text to an audio.
Input: A text in English language only.
Output: An Audio translation of the same.














#Project Scheduling and Estimation

 


5.1 Functional decomposition (WBS)


•	In project management and systems engineering, is a deliverable oriented decomposition of a project into smaller components. 
•	 A work breakdown structure element may be a product, data, a service, or any combination. 
•	A WBS also provides the necessary framework for detailed cost estimating and control along with providing guidance for schedule development and control.
•	The Work breakdown component of our project is illustrated below:
 


        	






 5.2 Roles and Responsibilities

The team members are as follows:
A:Priyank Hajela
B:Kriti Katyayan
C:Abid Ahmad
D:Hrushika Sherekar


S.no	Tasks	Roles and Responsibilities
1.	Requirements gathering.	B,C,D
2.	Planning and Software requirements.	A,B,D
3.	Project scope and documentation.	A,D,C
4.	Designing.	B,D
5.	Developing functional specifications.	A,C
6.	Implementation	A,B,C,D
7.	Testing and Debugging	A,B,C



5.3 Task Duration


S.no	Task	Number of days
1.	Establishing the project goals.	3 days
2.	Determining the project scope.	3 days
3.	Planning the software requirements.	6 days
4.	Analysis and drafting of the software requirements.	6 days
5.	Developing the functional specifications.	7 days
6.	Developing the initial documentation.	7 days
7.	Designing the use cases, class diagrams and data flow diagrams.	7 days
8. 	Implementation of the software.	15 days
9.	Testing and Debugging.	7 days



GANTT CHART :
 

A Gantt chart, commonly used in project management, is one of the most popular and useful ways of showing activities .

A Gantt chart helps us examine:
	What the various activities are
	When each activity begins and ends
	How long each activity is scheduled to last
	Where activities overlap with other activities, and by how much
	The start and end date of the whole project


5.4 Size and Budget Estimation

The estimation of  the effort and development time for the project is based upon Basic COCOMO (Cost Constructive Model).

 The basic COCOMO estimation model is given by the following expressions:
 Effort = a1 х (KLOC)a2 PM
 Tdev = b1 x (Effort)b2 Months


Software Project	a1	a2	b1	b2
Organic	2.4	1.05	2.5	0.38
Semi-detached	3.0	1.12	2.5	0.35
Embedded	3.6	1.20	2.5	0.32


The type of the project- The type of the project undertaken is semi-detached.The development team consists of     members that have limited experience on the such similar projects.

The lines of code to implement the project:1.28 KLOC
a1=3.0 , a2=1.12, b1=2.5, b2=0.35

Effort= a1 x (kLOC)a2 PM
Effort = 3.0 х (1.28)1.12 PM = 3.95 PM

Development Time(Tdev)=b1 x (effort)b2 Months
Tdev = 2.5 x (3.95)0.35 Months = 4.04 Months





5.5 Risk Monitoring, Mitigation and Management (RMMM)

S.no	Risk Name	Type of Risk	Probability	Impact 	RMMM
1.	Failure to translate the text.	Technical	50%	The user is unable to view the translation.	Make sure that the user is aware that active internet connection is required for the software  to perform the translation.
2.	The pictures clicked to translate may occupy memory space unnecessarily.	Technical	80%	The user may face memory storage problem after some time.	The software automatically deletes the images clicked after the translation is done.
3.	Certain words found in one language may not be available in the language it is being translated into.	Non-technical	30%	The user may get incomplete or absurd translation.	Maximum care is taken to ensure that the translation is as accurate as possible.
4.	Sometimes, a single word may have two meanings in a particular language.	Non-technical	20%	The user may get inappropriate translation.	The software is able to distinguish between different types of words and their meanings.
5.	The text to speech converter gives incorrect results.	Non-technical	40%	The user may not get the expected audio.	It generally happens if the message is not properly recorded. Care must be taken.






____________________________________________________________________________________________________________________________________




 

Test case 1:  
LOGIN MODULE 

Test case Description :
This module describes the login module.
If there is a valid user account, it proceeds to the next Activity otherwise an error occurs and the no. of attempts are reduced.


Test
Case ID	Test Objective	Pre
condition	Steps	Test Data	Expected
Result	Actual
Result	Test
Status
TC_101	User Login	A valid user	1.Enter username
2.Enter
password	"Kriti"
"123"
	Logged in Successfully	Logged in Successfully	Passed
TC_102	User Login	A valid user	1.Enter username
2.Enter
password	"Random name"
"123"	Logged in Successfully	Login Failed	Failed

Implementation Screenshots :

1.SPLASH SCREEN :

 
               




Test case 2:  
TEXT DETECTION

Test case Description :
 This module detects the text captured.
The text image can be obtained either by clicking the image from the camera or by selecting it from the gallery.


Test
Case ID	Test Objective	Pre
condition	Steps	Test Data	Expected
Result	Actual
Result	Test
Status
TC_201	Text Detection	A valid
Image.	1.Click the image from the camera.
	Uploading the image.
	Display of the text in the image.	Text displayed Successfully	Passed
TC_202	Text Detection	A valid image.	1. Select image from the gallery.	Uploading the image.	Display of text in the image.	Text displayed 
successfully	Passed
TC_203	Text Detection	A valid image.	1. Select image from the gallery	Uploading the image.	Display of text in the image	Incorrect text displayed.	Failed


Implementation Screenshots :

UPLOADING OF IMAGE :
1. BY CAMERA
2. FROM GALLERY

                  



TEXT DETECTION

 



         

  

        







 Test case 3:  
TEXT TRANSLATION TO HINDI

Test case Description :
 This module converts the detected text to Hindi language.

Test
Case ID	Test Objective	Pre
condition	Steps	Test Data	Expected
Result	Actual
Result	Test
Status
TC_301	Translation	A valid text	1.Conversion of the text in image to hindi.	Data of the image.	Proper translation	Translation
Successful	Passed
TC_302	Translation	A valid text	1.Conversion of the text in image to hindi	Data of the image.	Proper translation	Translation
unsuccessful	Failed








Implementation Screenshots :

 

	





Test case 4:  
TEXT TO SPEECH

Test case Description :
 This module converts the detected text to speech.

Test
Case ID	Test Objective	Pre
condition	Steps	Test Data	Expected
Result	Actual
Result	Test
Status
TC_401	Text to Speech	A valid text	1.Conversion of the text in image to speech	Data of the image.	Proper speech translation	Translation
Successful	Passed
TC_402	Text to Speech	A valid text	1.Conversion of the text in image to speech	Data of the image.	Proper speech translation	Translation
unsuccessful	Failed







 





________________________________________________________________________________________

 

•	Translators & Interpreters are the Core Parts of the Shining India. Because, nowadays India is growing a lot in its Industrial Sector & it’s challenging the Global Economy. For India to make a mark in the Business Sectors globally, Translation & Interpretation plays a vital role.

•	Anyone with low skills would be able to use the translator by just clicking the picture and understanding the text written in the language they are comfortable with and also if not then they can use the text to audio to just listen to the translated language and understand.

Text-to-speech technology offers several benefits and the future scope . They are :

	Increase the accessibility of your online content for those with visual impairments or reading difficulties.
	Reach a larger percentage of the online population, including those whose native language is different from the language of your website or mobile app.
	Text-to-speech technology also enables bimodal content presentation where the information is presented in both audio and visual formats at the same time. Specific benefits of bimodal content presentation include:
	Improved word recognition skills and vocabulary
	Improved reading comprehension, fluency, accuracy, and concentration
	Improved information recall and learning/memory enhancement
	Increased motivation and more positive attitude with regard to reading
	Increased reading self-confidence and perceived performance
 

Software Intellectual Agent is a complete project which evolved from the basic idea to help out side India and illiterates to understand anything written anywhere and if not able to read, they can also use text to speech for their convenience.
According to our design and needs we have almost satisfied our work till 90% of what we planned in our project to do.
The whole group was a part of the project.
The application is working properly.
The project was submitted on time.
