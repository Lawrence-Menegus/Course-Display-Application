# Course Display Application


<p>This program demonstrates a simple GUI application for managing and displaying a list of courses. It allows users to add courses, sort them by code, name, or grade, and reset input fields. The application utilizes Java Swing for the GUI components and event handling.</p>
Program Overview


<p>The program performs the following tasks:</p>
<ul>
    <li>Initializes the main application frame.</li>
    <li>Allows the user to add courses with details such as code, name, credit, and grade.</li>
    <li>Displays the list of courses in a text area.</li>
    <li>Provides buttons to sort the courses by code, name, or grade.</li>
    <li>Includes a reset button to clear input fields and the display area.</li>
</ul>


### Compile and Run the Program
<p>To compile and run the program, follow these steps in your terminal:</p>
<b>Compile the Program</b>:
<pre><code>javac CourseDisplayViewer.java CourseDisplayFrame.java Course.java</code></pre>
<b>Run the Program</b>:

<pre><code>java CourseDisplayViewer</code></pre>

### Usage
<p>1. The program initializes the main application frame and sets its properties:</p>
<ul>
    <li>Sets the title to "My Course Display Frame".</li>
    <li>Ensures the application exits when the frame is closed.</li>
    <li>Makes the frame visible.</li>
</ul>
<p>2. The program defines a `Course` class to represent individual courses with the following properties:</p>
<ul>
    <li>Course code</li>
    <li>Course name</li>
    <li>Course credit</li>
    <li>Course grade</li>
</ul>
<p>The `Course` class includes methods to get and set these properties and a `toString` method to convert a course to a string format.</p>
<p>3. The program defines a `CourseDisplayFrame` class to create the GUI:</p>
<ul>
    <li>Includes buttons for adding courses, sorting by code, name, or grade, and resetting input.</li>
    <li>Includes text fields for inputting course details and a text area for displaying the list of courses.</li>
    <li>Defines action listeners for handling button clicks:</li>
    <ul>
        <li>`ClickListener` for adding a course to the list.</li>
        <li>`SortByCodeListener` for sorting courses by code.</li>
        <li>`SortByNameListener` for sorting courses by name.</li>
        <li>`SortByGradeListener` for sorting courses by grade.</li>
        <li>`ResetInputListener` for resetting input fields and the display area.</li>
    </ul>
    <li>Utilizes `ArrayList` to store the list of courses and `Comparator` classes to define sorting logic.</li>
</ul>
<p>4. The application provides a simple and interactive interface for managing a list of courses, with sorting and resetting functionalities to help organize and view the data efficiently.</p>

### Contributor
<p>Lawrence Menegus</p>
