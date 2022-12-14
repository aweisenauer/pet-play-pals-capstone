import axios from 'axios';

export default {
  registerPet(newPet) {
    return axios.post('/pets', newPet);
  },
  getAllPets() {
    return axios.get('/pets');
  },
  getPetById(petId) {
    return axios.get(`/pets/${petId}`);
  },
  getAllPetsByOwnerId(ownerId) {
    return axios.get(`/pets?ownerId=${ownerId}`);
  },
  updatePet(updatedPet, petId) {
    return axios.put(`/pets/${petId}`, updatedPet);
  },
  deletePet(petId) {
    return axios.delete(`/pets/${petId}`);
  }
}