# Public Documents
The Regulation on Public Documents (http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32016R1191) foresees the use of multilingual standard forms suitable for electronic exchange in order to facilitate the translation of the public documents to which they are attached.
The objective of this task is to create the technical representations of the standardised forms for the Regulation on Public Documents as XML schema files (xsd).
In order to maximize semantic and technical interoperability, the XML schemas will use existing standards or results from previous projects where possible, and will have - at the core - a common subset of each form while additional elements will be included, if needed, for each MS.
# Standards used
The XML schemas generated contain the following standards: 
* Core Vocabularies (https://joinup.ec.europa.eu/community/semic/og_page/core-vocabularies)
* UBL (http://docs.oasis-open.org/ubl/UBL-2.1.html) 

# Tools used
* Modelling: Papyrus: https://eclipse.org/papyrus/ 
* Transformation: Acceleo: http://www.eclipse.org/acceleo/
* XSD validation: 
	* SQC (http://xml.coverpages.org/IBM-SQC211-CommandUse.html)
	* XSV (http://www.ltg.ed.ac.uk/~ht/xsv-status.html)
	* JAXB (http://www.oracle.com/technetwork/articles/javase/index-140168.html - check is performed only if the Java objects are generated)

# Setup
* Download Eclipse JEE Neon from (the JEE version includes the XML editor and it requires Java 8): https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/neon3
* Unzip the folder and run eclipse.exe (choose any folder as workspace)
* Go on menu "Help" -> "Install New Software..."
* In the "work with" dropdown menu select: "Neon - http://download.eclipse.org/releases/neon"
* Wait that the list of plugins appears and search for the "Modeling" section
* Expand the "Modeling" section, select "Acceleo" and "Papyrus UML" plugins
* click on "Next", click on "Next" again, accept the licence and click on "Finish"
* Wait that the plugins are downloaded and restart Eclipse if requested
* Go on menu "File" -> "Import..." -> Expand "Git" -> Select "Projects from Git" -> click "Next"
* Select "Clone URI" -> click "Next"
* in URI paste the URL: https://github.com/e-documents-isa/publicdocs.git -> click "Next"
* Make sure you select only the branch "origin/master", click "Next, click "Next"
* In the import wizard make sure that "Import exisint Eclipse project" is selected, click "Next" and click "Finish"
* You can close the welcome page (if it appears) and in "Project Explorer" you should be able to see the project






# File structure
* config.properties: contains all the variables used by Acceleo to perform the transformation of the model into XML schemas
* model: contains the UML model (class diagram) created via Papyrus
* src: contains the Acceleo templates that perform the transformation
* lib: libraries used by the Acceleo modules
* generated: contains the XML schemas generated

# Licence
* The XML schemas are released under ISA Open Metadata Licence v1.1 (https://joinup.ec.europa.eu/category/licence/isa-open-metadata-licence-v11)
* The code is released under EUPL v1.1 (https://joinup.ec.europa.eu/community/eupl/og_page/european-union-public-licence-eupl-v11)