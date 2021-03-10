package es.abelfgdeveloper.common.server.gateway.service.impl;

import es.abelfgdeveloper.common.server.gateway.domain.RouteData;
import es.abelfgdeveloper.common.server.gateway.service.RouteRepositoryService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InMemoryRouteRepositoryService implements RouteRepositoryService {

  @Override
  public List<RouteData> getRoutes() {
    List<RouteData> routes = new ArrayList<>();

    return routes;
  }
}
