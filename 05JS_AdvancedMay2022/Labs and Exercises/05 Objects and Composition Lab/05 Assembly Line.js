function assemblyLine() {
    return {
      hasClima(car) {
        car.temp = 21;
        car.tempSettings = 21;
        car.adjustTemp = () => {
          this.temp < this.tempSettings ? this.temp++
            : this.temp--;
        }
      },
      hasAudio(car) {
        car.currentTrack = {name: '', artist: ''};
        car.nowPlaying = () => {
          if (car.currentTrack !== null) {
            console.log(`Now playing '${currentTrack.name}' by ${currentTrack.artist}`);
          }
        }
      },
      hasParktronic(car) {
        car.checkDistance = (distance) => {
          if (distance < 0.1) {
            console.log('Beep! Beep! Beep!');
          } else if (0.1 <= distance && distance < 0.25) {
            console.log('Beep! Beep!');
          } else if (0.25 <= distance && distance < 0.5) {
            console.log('Beep!');
          } else {
            console.log('');
          }
        }
      }
    }
  } 