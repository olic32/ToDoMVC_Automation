# todomvc_automation



We decided to work on 2 different aspects of the final test suite from the start. We discovered that about 15 of the main frameworks had very similar elements and front end. As such, we decided to build a POM for the ToDo page, and automate as many tests across these 15 frameworks as possible. Additionally, as this meant certain important frameworks would be missed, we decided to build a suite of test alongside this 
specifically for the react framework, as it is very popular.


# Test Coverage

___All The following tests for the first 15 frameworks___
___, plus all these tests written specifically for the react framework in Firefox browser___

Add a new ToDo item 

Can add a value with a single character

Check that to-do list supports accented characters and symbols by entering 2 different characters and 2 different symbols

Modify a ToDo item (by double-clicking)

If you modify a ToDo item and click Escape during edit, it should cancel the modification

A ToDo item can be ticked-off (it will appear with a line through it)

A completed ToDo item can be unticked again

Delete an incomplete ToDo item

Delete a completed ToDo item

Status bar displays "0 items left" when there are no items left

Status bar displays "1 item left" when there is 1 item left

Status bar displays "2 items left" when there are 2 items left

Status bar displays "99 items left" when there are 99 items left (testing upper limit)

Status bar is hidden when there are no ToDo items in the system

Status bar can toggle between Active, All and Completed

ToDo items have a 256 character limit

___Frameworks covered___

-Backbone.js
-knockout.js
-Dojo
-Knockback
-CanJS
-Mithril
-Vue.JS
-Marionette.JS
-Kotlin + React
-Spine
-Dart
-Closure
-Elm
-AngularDart
-Reagent



# Notes
 As mentioned below, some of the tests are not complete, certain tests have been disabled. mostly these are annotated to explain the issues. Additionally, we created a bug report file as a few bugs came up during testing, and these tests have also been disabled.
 
 The test looking for a strikethrough uses a screenshot to take a picture of the strike. This has also been disabled.
 
 There are a couple of tests that take a very long time to run - also disabled.


# File structure

__AppTest__ - Default file in Gradle project. 

__HomepagePOM__ - Page-Object-Model for the ToDoMVC homepage. Contains only one function which navigates to the correct framework URL

__ToDoPOM__ - Page-Object-Model for the actual ToDo page. More on this below

__ToDoMVCChromeTest__ - List of tests across 15 frameworks covering _most_ of the test plan (TESTS HERE)

__ToDoMVCFirefox__ - Copy of the above file with a firefox driver inswtead of chrome to see if it works. Mostly passes but some tests would need altering. Mainly done as en experiment.

__ToDoMVCReactFF__ - Tests written specifically for the React framework in Firefox browser (TESTS HERE)

__Bugs Found__ - using automation we discovered a number of bugs that may not have been discovered in manual test. Listed here.
