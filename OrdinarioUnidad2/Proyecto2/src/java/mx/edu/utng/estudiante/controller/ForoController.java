/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.estudiante.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.utng.estudiante.dao.ForoDAO;
import mx.edu.utng.estudiante.dao.ForoDAOImp;
import mx.edu.utng.estudiante.dao.EstudianteDAOImp;
import mx.edu.utng.estudiante.model.Foro;

/**
 *
 * @author juan-
 */
@WebServlet(name = "ForoController", urlPatterns = {"/ForoController"})
public class ForoController extends HttpServlet {

    private static final String LISTA_FORO
            = "/listarForos.jsp";
    private static final String AGREGAR_O_CAMBIAR
            = "/foros.jsp";
    private ForoDAO dao;

    public ForoController() {
        dao = new ForoDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_FORO;
            int idForo = Integer.parseInt(request.getParameter("idForo"));
            dao.borrarForo(idForo);
            request.setAttribute("foros",dao.desplegarForo());//tengo duda aqui foros

        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_O_CAMBIAR;
            int idForo = Integer.parseInt(request.getParameter("idForo"));
            Foro foro = dao.elegirForo(idForo);
            request.setAttribute("foro", foro);

        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_O_CAMBIAR;

        } else {
            forward = LISTA_FORO;
            request.setAttribute("foros", dao.desplegarForo());
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Foro foro = new Foro();

        String idForo = request.getParameter("idForo");
        foro.setTitulo(request.getParameter("titulo"));
        foro.setDescripcion(request.getParameter("descripcion"));
        foro.setEstado(Integer.parseInt(request.getParameter("estado")));
        if (idForo == null || idForo.isEmpty()) {
            dao.agregarForo(foro);
        } else {
            foro.setIdForo(Integer.parseInt(idForo));
            dao.cambiarForo(foro);
        }

        RequestDispatcher view = request.getRequestDispatcher(LISTA_FORO);
        request.setAttribute("foros", dao.desplegarForo());
        view.forward(request, response);

    }
}
