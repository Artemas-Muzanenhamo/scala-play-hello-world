package movie

import com.google.inject.{Inject, Singleton}

@Singleton
class MovieService @Inject()(val movieConnector: MovieConnector) {
  def getJamesBondMovie: Movie = movieConnector.retrieveMovieById("1")
}
