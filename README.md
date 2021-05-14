## tt_tech_test
Create an API from an XML file and create a full stack app displaying key information from the API.


### To run the code found in this repository:

Clone the repository:
To clone this repo please follow the instructions found in the github.com link:
https://docs.github.com/en/free-pro-team@latest/github/creating-cloning-and-archiving-repositories/cloning-a-repository

### Server Side

- Once the project has been cloned, open up the server side folder in your IDE of choice. The code is written in Java,
so an IDE compatible with this language is preferable.

- With the IDE open - navigate to the folder src > main > java > com.example.traveltek_tech_test > models

- Right-click the file with the name XmlParser and run XmlParser.main()

- You should now see the XML data converted to JSON. (When the file is running the data is not yet been sorted/organised)

- To run the database you will need to right-click and run the file src > main > java > com.example.traveltek_tech_test > TraveltekTechTestApplication- 

- Open your browser window and go to the address: http://localhost:8080/api/h2/
  - Make sure the JDBC URL = jdbc:h2:file:./db/tt-demo
  - Username = sa
  - Password field to be left empty

- Click the connect button and once you are logged in - you have access to the SQL tables that will store the XML as JSON.
  - This step is not complete and will return only empty tables as of no.
  
#### These are all the steps we have for the server side for now as it is not yet complete.

#### I have not added any additional steps to run the client side because it has also not been completed yet and will return no information.
  
 
