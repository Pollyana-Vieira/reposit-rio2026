"use client";

import { TypeTarefa } from "../types/interfaces";

export const getAtividades = (): TypeTarefa[] => {
  try {
    const atividades = localStorage.getItem("atividades");
    if (!atividades) return [];
    return JSON.parse(atividades) as TypeTarefa[];
  } catch (err) {
    console.warn("getAtividades: dado inválido no localStorage, removendo item.", err);
    try {
      localStorage.removeItem("atividades");
    } catch (e) {
      // ignore
    }
    return [];
  }
};

// Salva as atividades no localStorage
const saveAtividades = (atividades: TypeTarefa[]): boolean => {
  try {
    localStorage.setItem("atividades", JSON.stringify(atividades));
    return true;
  } catch (err) {
    console.error("saveAtividades: erro ao salvar no localStorage", err);
    return false;
  }
};

// Adiciona uma nova atividade
export const adicionarAtividade = (text: string): boolean => {
  const novasAtividades = [
    ...getAtividades(),
    { id: crypto.randomUUID(), texto: text, concluida: false },
  ];
  return saveAtividades(novasAtividades);
};

// Remove uma atividade pelo id
export const removerAtividade = (id: string): boolean => {
  const novasAtividades = getAtividades().filter(
    (atividade) => atividade.id !== id
  );
  return saveAtividades(novasAtividades);
};

// Atualiza o texto de uma atividade
export const atualizarAtividade = (
  id: string,
  novoTexto: string
): boolean => {
  const novasAtividades = getAtividades().map((atividade) =>
    atividade.id === id ? { ...atividade, texto: novoTexto } : atividade
  );
  return saveAtividades(novasAtividades);
};

// Marca uma atividade como concluída
export const marcarComoConcluida = (id: string): boolean => {
  const novasAtividades = getAtividades().map((atividade) =>
    atividade.id === id
      ? { ...atividade, concluida: !atividade.concluida }
      : atividade
  );
  return saveAtividades(novasAtividades);
};
