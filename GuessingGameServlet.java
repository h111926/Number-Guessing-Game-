package com.example.game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuessingGameServlet extends HttpServlet {
    private GameLogic game;

    @Override
    public void init() {
        game = new GameLogic();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
        String message = game.checkGuess(userGuess);

        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
