package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Team;
import LyrecoPionner2023.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TeamRestControler {

    @Autowired
    private TeamService teamService;

    public TeamRestControler(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping( "team/{id}" )
    public Optional<Team> findTeamById(@PathVariable("id") Long id
    ){
        return teamService.findTeamById(id);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Team> listTeams(){
        return teamService.teams();
    }

    @RequestMapping(value = "/teams/create", method = RequestMethod.POST)
    public Team createTeam(@RequestBody Team team){
        return teamService.createTeam(team);
    }
    @RequestMapping(value = "/teams/{id}", method = RequestMethod.PUT)
    public Team updateTeam(@RequestBody Team team , @PathVariable("id") @NotNull Long id ){
        return teamService.updateTeam(team,id);
    }

    @RequestMapping(value = "/teams/delete", method = RequestMethod.DELETE)
    public Team team(@RequestBody Team team) {
        return teamService.deleteTeam(team);
    }

}
