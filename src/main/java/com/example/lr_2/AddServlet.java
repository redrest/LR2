
package com.example.lr_2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import com.google.gson.*;
class GFG {
    String name;
    String lastname;
    String middlename;
    Integer age;
    String language;

    public GFG() {
        this.name = "";
        this.lastname = "";
        this.middlename = "";
        this.age = 0;
        this.language = "";
    }
}

class User {
    private String name;
    private String lastname;
    private String middlename;
    private Integer age;
    private String language;

    public User(String name, String lastname, String middlename, Integer age, String language) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.age = age;
        this.language = language;
    }
}
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/addUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        BufferedReader reader = request.getReader();
        GFG gfg = gson.fromJson(reader, GFG.class);

        String name = gfg.name;
        String lastname = gfg.lastname;
        String middlename = gfg.middlename;
        Integer age = gfg.age;
        String language = gfg.language;

        User user = new User(name, lastname, middlename, age, language);
        users.add(user);

        String path = "C:\\Users\\esapr\\IdeaProjects\\OOP\\LR_2\\src\\main\\webapp\\json\\data.json";
        try (Writer writer = new FileWriter(path)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }

        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
            gson.toJson(user, out);
        }
    }
}