package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Team;
import LyrecoPionner2023.repository.TeamRepository;
import LyrecoPionner2023.service.TeamService;
import exception.TeamNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Optional<Team> findTeamById(Long id) {
        final Optional<Team> optionalTeam = this.teamRepository.findById(id);

        if (optionalTeam.isPresent()) {
            final Team team = optionalTeam.get();
            return teamRepository.findById(id);
        } else {
            throw TeamNotFoundException.teamNotFound();
        }
    }

    @Override
    public List<Team> teams() {
        return teamRepository.findAll();


    }

    @Override
    public Team createTeam(Team team) {
        teamRepository.save(team);
        return team;
    }
    @Override
    public Team updateTeam(Team team, Long id) {
        team.setId(id);
        return  teamRepository.save(team);
    }

    @Transactional
    public Team deleteTeam(Team team) {
        teamRepository.delete(team);
        return team;
    }


}
