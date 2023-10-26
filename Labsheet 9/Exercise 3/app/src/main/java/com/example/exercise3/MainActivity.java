package com.example.exercise3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Course> courseList;
    private CourseAdapter adapter;
    private TextView courseNameTextView;
    private TextView lecturerTextView;
    private TextView creditsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseList = new ArrayList<>();
        courseList.add(new Course("ICT 3233", "Mobile Application Development", "Mrs. Malsha", "3 credits"));
        courseList.add(new Course("ICT 3273", "Advanced Database", "Mr. Nuwan", "3 credits"));
        courseList.add(new Course("ICT 3222", "Data Mining and Business Intelligence", "Mrs. Akila", "2 credits"));
        courseList.add(new Course("ICT 3253", "Distributed & Cloud Computing", "Mrs. Piyumi", "3 credits"));

        adapter = new CourseAdapter(this, R.layout.list_item, courseList);

        ListView courseListView = findViewById(R.id.courseListView);
        courseListView.setAdapter(adapter);

        courseNameTextView = findViewById(R.id.courseNameTextView);
        lecturerTextView = findViewById(R.id.lecturerTextView);
        creditsTextView = findViewById(R.id.creditsTextView);

        courseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Course selectedCourse = courseList.get(position);

                courseNameTextView.setText("Course Name: " + selectedCourse.getCourseName());
                lecturerTextView.setText("Lecturer: " + selectedCourse.getLecturer());
                creditsTextView.setText("Credits: " + selectedCourse.getCredits());
            }
        });
    }
}
