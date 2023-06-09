package vn.elca.training.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.elca.training.model.dto.ProjectDto;
import vn.elca.training.service.ProjectService;

/**
 * @author thomas.dang - thongdhse160015
 *
 */
@Profile("dummy")
// @Profile("!dummy | dev")
@RestController
@RequestMapping("/project")
public class ProjectController extends AbstractApplicationController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/search/{id}")
    @ResponseBody
    public ProjectDto getProjectById(@PathVariable long id) {
        return projectService.findAll()
                .stream()
                .filter(product -> product.getId() == id)
                .map(mapper::projectToProjectDto)
                .findFirst().orElseThrow();
    }
}
