package edu.ifmt.cobrancaifmt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import edu.ifmt.cobrancaifmt.model.Titulo;
import edu.ifmt.cobrancaifmt.repository.TituloRepository;

import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.cobrancaifmt.model.StatusTitulo;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/titulos")
public class TituloController {
    
    @Autowired //anoração que irá injetar dependecia
    private TituloRepository titulos;

    @RequestMapping("/novo")
    public ModelAndView novo(){
        ModelAndView mv = new ModelAndView("CadastroTitulo");
        mv.addObject("todosStatusTitulo", StatusTitulo.values());

        return mv;
    }    
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView salvar(Titulo titulo){
    titulos.save(titulo);
    ModelAndView mv = new ModelAndView("CadastroTitulo");
    mv.addObject("mensagem", "Foi salvo com sucesso!");
    return mv;
    }

    @RequestMapping
    public ModelAndView pesquisar(){
        List<Titulo> todosTitulos = titulos.findAll();
        ModelAndView mv = new ModelAndView("PesquisaTitulos");
        mv.addObject("titulos", todosTitulos);
        return mv;
    }

}




