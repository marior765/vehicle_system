import React, { Component } from 'react';

export default class App extends Component {
  state = {
    message: null,
  }

  componentDidMount() {
    // Make a GET-request to our backend
    fetch('/api/hello')
      // Map the result to a JSON-object
      .then(response => response.json())
      // Put the message in the state
      .then(response => {
        this.setState({ message: response.message })
      })
  }

  render() {
    return (
      <div className="App">
        <p>Message from backend: {this.state.message}</p>
      </div>
    )
  }
}